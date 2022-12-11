package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C4_GetPageSource {
    public static void main(String[] args) {
        //Path i set et
        System.setProperty("webdriver.chrome.driver","C:/Users/ustab/Documents/selenium dependencies/drivers/chromedriver.exe");

        //chrome driver objesi oluştur
        WebDriver driver=new ChromeDriver();

        //sayfayı maximize et
        driver.manage().window().maximize();

        //google anasayfasına git
        driver.get("https:/www.google.com");

        //amazon sayfasına git
        driver.navigate().to("https:/www.amazon.com");

        String pageSource=driver.getPageSource();

        System.out.println(pageSource);

        //getPageSource(), page soruce String olarak döndürür
        //tum safyanın içinde istediğimiz bir text in kullanılıp kullanılmadığını verify edebiliriz
        //Note: pageSource icin assertion pek sık kullanılmaz cünkü burada çok genel bilgi vardır ve bize yanlıs (false) sonuc verebilir

  //      System.out.println(pageSource.contains("Electronics"));

        if(pageSource.contains("Gaming accessories")){
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisiz");
        }
        driver.close();
    }
}
