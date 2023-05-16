package practice;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    /*
    1-Driver oluşturalim
    2-Java class'imiza chnomedriver. exetyi tanitalim
    3-Driver'in tum ekranı kaplamasini sagu ayalim
    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
     Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
    5-Navigate to http://www.babayigit.net/murat/testpage.html
    6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        alanlarına gerekli bilgileri yazsın
    7-Submit tuşuna bassın.
    8- All information was entered correctly.. yazısının göründüğünü test etsin
    9- Clear butonu ile tüm butonları temizlesin
    10- Manuel olarak temizlendiğini görecek kadar beklesin
    11- Sayfayı kapatsın
    10-8. maddededeki Test sonucunu yazdırsın
     */

    public static void main(String[] args) throws InterruptedException {

    //1-Driver oluşturalim
    //    2-Java class'imiza chnomedriver. exetyi tanitalim
    System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    //    3-Driver'in tum ekranı kaplamasini sagu ayalim
    driver.manage().window().maximize();

    //    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
    //     Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //    5-Navigate to http://www.babayigit.net/murat/testpage.html
    driver.navigate().to("http://www.babayigit.net/murat/testpage.html");
    //    6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
    //        alanlarına gerekli bilgileri yazsın
        WebElement firstName = driver.findElement(By.xpath("//*[@id='ad']"));
        WebElement surName = driver.findElement(By.xpath("//*[@id='soyad']"));
        WebElement age = driver.findElement(By.xpath("//*[@id='yas']"));
        WebElement yourJob = driver.findElement(By.xpath("//*[@id='meslek']"));
        WebElement birthPlace = driver.findElement(By.xpath("//*[@id='dogum_yeri']"));
        WebElement lGS = driver.findElement(By.xpath("//*[@id='mezun_okul']"));
        WebElement numberOfChildren = driver.findElement(By.xpath("//*[@id='cocuk_sayisi']"));

        firstName.sendKeys("Mehmet");
        surName.sendKeys("Filik");
        age.sendKeys("32");
        yourJob.sendKeys("Tester");
        birthPlace.sendKeys("Adiyaman");
        lGS.sendKeys("ITU");
        numberOfChildren.sendKeys("0");


    //    7-Submit tuşuna bassın.
        WebElement submitButonu = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButonu.submit();
    //    8- All information was entered correctly.. yazısının göründüğünü test etsin
        //String expectedYazi = "All information was entered correctly..";
        WebElement uyariYazisi = driver.findElement(By.id("uyari"));
        if (uyariYazisi.isDisplayed()){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
    //    9- Clear butonu ile tüm butonları temizlesin
        Thread.sleep(2000);
        WebElement clearButonu = driver.findElement(By.xpath("//*[@type='reset']"));
        clearButonu.submit();
    //    10- Manuel olarak temizlendiğini görecek kadar beklesin
        Thread.sleep(2000);
    //    11- Sayfayı kapatsın
        driver.close();
    //    10-8. maddededeki Test sonucunu yazdırsın

    }
}
