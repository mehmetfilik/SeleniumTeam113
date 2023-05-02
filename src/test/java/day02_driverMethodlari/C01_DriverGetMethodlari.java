package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        // Sisteme Webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunda soyler
        WebDriver driver = new ChromeDriver();
        // Bilgisayardaki Chrome Browser'in otomasyonla calisacak bir kopyasini olusturur
        // Chrome disinda bir Browser kullanmak istersek
        // yine Chrome gibi o browser'in driverini indirip ayni islemleri yapmaliyiz

        // Olusturdugumuz driver objesi bizim elimiz ve gozumuz gibidir

        driver.get("https://www.amazon.com");
        // www. yazmasak da calisir ancak https:// yazmazsak calismaz

        System.out.println(driver.getTitle()); // bize title dondurur

        System.out.println(driver.getCurrentUrl()); // bize gidilen url'i dondurur

        driver.get("https://www.wisequarter.com"); // istenen url'e bizi goturur
        // www yazmasak da calisir ancak https:// yazmazsak calismaz
        System.out.println(driver.getTitle()); // bize title'i dondurur
        // IT Bootcamp, Distance education method - Wise Quarter Course
        System.out.println(driver.getCurrentUrl()); // gidilen url'i dondurur
        // https://wisequarter.com/
        System.out.println(driver.getPageSource());
        // gidilen web sayfasinin kaynak kodlarini dondurur
        System.out.println(driver.getWindowHandle()); // B5C6BBDE9C288E0ADB980B8C2C1A666A
        // acilan her bir pencereye verilen unique hash code degeridir
        System.out.println(driver.getWindowHandles()); // [BF8E71E46E92421DEFD0C6847D0D9D00]
        // eger driver calisirken birden fazla pencere veya tab olusturduysa
        // acilan tum windows/tab'lerin unique hash code'larini bir set olarak dondurur





        Thread.sleep(5000); // mili sn olarak yazidigimiz sayi suresince kodu bekletir

        driver.close(); // acilan browser'i kapatir





    }
}
