package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C2_BasicNavigations {
    /*
    Main method oluştur
    Path i set et
    Chrome driver oluştur
    Windows u maximize et
    Google ana sayfasına git https://www.google.com/
    Aynı class in içinde, amazon anasayfasını (home page) Navigate et https://www.amazon.com/
    Google ı tekrar/geri Navigate et
    Amazon a tekrar /geri Navigate et
    Sayfayı Refresh (yenile) et
    Browser dan Close/Quit yap
     */
    public static void main(String[] args) {
        //path i set et
        System.setProperty("webdriver.chrome.driver","C:/Users/ustab/Documents/selenium dependencies/drivers/chromedriver.exe");

        //Chrome driver oluştur
        WebDriver driver=new ChromeDriver();

//      Windows u maximize et
        driver.manage().window().maximize();

//        Google ana sayfasına git https://www.google.com/
        driver.get("https://www.google.com/");

//        Aynı class in içinde, amazon anasayfasını (home page) Navigate et https://www.amazon.com/
//        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");

//        Google ı tekrar/geri Navigate et
        driver.navigate().back();

//        Amazon a tekrar /geri Navigate et
        driver.navigate().forward();

//        Sayfayı Refresh (yenile) et
        driver.navigate().refresh();

//        Browser dan Close/Quit yap
        driver.quit();
    }
}
