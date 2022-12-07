package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C1_FirstSeleniumClass {
    public static void main(String[] args) {

        //Driver in Type ve Path için System.setProperty() oluştur
       System.setProperty("webdriver.chrome.driver","C:/Users/ustab/Documents/selenium dependencies/drivers/chromedriver.exe");

       //WebDriver object oluştur. Otomation code için bu ZORUNLUDUR

        WebDriver driver=new ChromeDriver();

        //get() url e gitmek için kullanılır
        driver.get("https://www.google.com/");



    }
}
