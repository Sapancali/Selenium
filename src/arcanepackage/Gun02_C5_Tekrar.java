package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C5_Tekrar {
  /*
Create a new class : Tekrar
ChromeDriver kullanarak, youtube git ve page basliginin  "youtube" oldugunu verify et, eger degilse dogrusunu yazdir.
the page URL'in youtube  icerip icermedigini verify et, ve dogru url'i yazdir.
Sonra https://www.amazon.com/ git
youtube geri navigate et
page'i Refresh et
amazon'a tekrar navigate et
Maximize the window
page basliginin "Amazon" icerdigini dogrula, eger degilse dogru basligi yazdir
page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
Quit the browser
 */
  public static void main(String[] args) {
      //Path i set et
      System.setProperty("webdriver.chrome.driver","C:/Users/ustab/Documents/selenium dependencies/drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https:/www.youtube.com");

      //  "https:/www.youtube.com sayfasının "youtube" verify et
      String expectedBaslik="youtube";
      String actualBaslik= driver.getTitle();
      if(expectedBaslik.contains(actualBaslik)){
          System.out.println("Basarili");
      }else{
          System.out.println("Basarisiz");
          System.out.println("Expected Baslik: "+expectedBaslik);
          System.out.println("Actual Baslik: "+actualBaslik);
      }
      String pageSourse= driver.getPageSource();
      if(pageSourse.contains("Home")){
          System.out.println("Pass");
      }else {
          System.out.println("Fail");
      }
   //Sonra https://www.amazon.com/ git
   driver.get("https://www.amazon.com/");

      //amazon'a tekrar navigate et
      driver.navigate().back();

      //page'i Refresh et
      driver.navigate().refresh();

      //amazon'a tekrar navigate et
      driver.navigate().forward();

//page basliginin "Amazon" icerdigini dogrula, eger degilse dogru basligi yazdir
      String expectedTitle="Amazon";
      String actualTitle=driver.getTitle();

      if(expectedTitle.contains(actualTitle)){
          System.out.println("Test Basarili");
      }else{
          System.out.println("Test Basarisiz");
          System.out.println("Actual Baslik:"+actualTitle);
          System.out.println("Expected Baslık: "+expectedTitle);
      }

//page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
      String expectedUrl="https://www.amazon.com/";
      String actualUrl=driver.getCurrentUrl();

      if(actualUrl.contains(expectedUrl)){
          System.out.println("Test Basarili");
      }else {
          System.out.println("Test Basarisiz");
          System.out.println("Actual Url: "+actualUrl);
          System.out.println("Expected Url: "+expectedUrl);
      }
// Quit  the browser
      driver.close();

  }

}
