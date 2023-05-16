package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class P02 {
    /*
     . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de” adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/” adresine gidip
9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
    public static void main(String[] args) throws InterruptedException {
        //1-Java class'imiza chnomedriver.exe' yi tanitalim
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        //2-Driver oluşturalim
        WebDriver driver = new ChromeDriver();
        //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //5-"https://www.otto.de” adresine gidelim
        driver.get("https://www.otto.de");
        //6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoTitle = driver.getTitle();
        System.out.println("ottoTitle = " + ottoTitle);
        String ottoUrl = driver.getCurrentUrl();
        System.out.println("ottoUrl = " + ottoUrl);
        //7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
        if (ottoTitle.contains("OTTO") && ottoUrl.contains("OTTO")) {
            System.out.println("OTTO yazısı her ikisinde de vardır. Test BAŞARILI");
        } else {
            System.out.println("En az birinde OTTO yoktur. TEST FAILED");
        }
        System.out.println("=============================================");
        //8-Ardindan "https://wisequarter.com/” adresine gidip
        driver.navigate().to("https://wisequarter.com/");
        //9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        String wqTitle = driver.getTitle();
        System.out.println("wqTitle = " + wqTitle);
        boolean isTrue = wqTitle.contains("Quarter"); //true-false
        if (isTrue) {
            System.out.println("Your Test  PASSED");
        } else {
            System.out.println("Your Test FAILED");
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("All is well");
        driver.close();
    }
}