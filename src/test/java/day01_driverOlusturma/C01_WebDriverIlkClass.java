package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverIlkClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        // src>resources>chromedriver.exe yi sag tikla
        // Copy Path/Reference yap
        // Path From Content Root ile yolu kopyala

        WebDriver driver = new ChromeDriver();
        // Chrom un bir kopyasini olusturuyor ve adina driver dedigimiz objeye kaydediyoruz
        driver.get("https://www.amazon.com");

    }
}
