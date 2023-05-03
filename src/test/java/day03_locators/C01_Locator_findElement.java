package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // arama kutusuna nutella yazdirip
        /*
            Test otomasyonu yaparken
            bir web elementi kullanmak istersek 2 seye ihtiyacimiz var
            1- O web elementi benzersiz olarak tarif edebilecegimiz bir locator
            2- Bu locator'i soyledigimizde bize web elementi bulup getirecek method

            Ornek; amazon sitesindeki arama kutusunun Unique tarif edicisi olarak
            id = "twotabsearchtextbox" kullanabiliriz
         */

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        // data turu    objenin adi    =    findElement : webelementi bulan method
        //                                  (By : webelementi bulacagimiz locator'in turunu yazdigimiz method)
        //                                  "twotabsearchtextbox" : Unique tarif icin id attribute degeri

        /*
            findElement() verdigimiz locator turu ve o locator icin verdigimiz degere gore
            webelementi arar
            locator icin verdigimiz deger hataliysa veya
            locator stratejisinde hata yaptiysak
            aranan web elementi implicitlyWait olarak tanimladigimiz
            maximum sure boyunca arar
            bulamadigi icin "NoSuchElementEsception" firlatir ve
            kodlarin kalanini calistirmaz
         */
        aramaKutusuElementi.sendKeys("Nutella");
        // istenen webelemente istenen yaziyi gonderir

        // enter tusuna basarak arama yapin
        aramaKutusuElementi.submit();
        // istenen webelementi uzerinde enter tusuna basar


        Thread.sleep(7000);
        driver.close();
    }
}
