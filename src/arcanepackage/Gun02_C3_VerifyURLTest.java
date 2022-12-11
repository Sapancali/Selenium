package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C3_VerifyURLTest {
    /*
    Google ana sayfasına git
    Google anasayfasinda url in "www.google.com" olduğunu doğrula/verify et
     */
    public static void main(String[] args) {
        //Path i set et
        System.setProperty("webdriver.chrome.driver","C:/Users/ustab/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:/www.google.com");
        String expectedUrl= "www.google.com";
        String actualUrl= driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Basarili");
        }else {
            System.out.println("Basarisiz");
            System.out.println("Actual:"+ actualUrl);
            System.out.println("Expect: "+expectedUrl);
        }


    }
}
