package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C2_VerifyTitleTest {

            //Path'i set et
            //Chrome driver olustur
           // Window'u Maximize et
            //https://www.google.com/ anasayfasını ac
            // Google başlığının google olduğunu doğrula

            public static void main(String[] args) {
                //Path'i set et
                System.setProperty("webdriver.chrome.driver", "C:/Users/ustab/Documents/selenium dependencies/drivers/chromedriver.exe");

                //Chrome driver olustur
                WebDriver driver = new ChromeDriver();

                // Window'u Maximize et
                driver.manage().window().maximize();

                //https://www.google.com/ anasayfasını ac
                driver.get("https://www.google.com/");

                // Google başlığının google olduğunu doğrula
                String expectedTitle="Google";
                    String actualTitle= driver.getTitle();

                    if(expectedTitle.equals(actualTitle)){
                        System.out.println("Basarili");
                    }else{
                        System.out.println("Basarisiz");
                        System.out.println("Beklenen: "+expectedTitle);
                        System.out.println("Gercekte: "+actualTitle);
                    }
                    driver.close();
            }
/*
Eger yazdığımız scriptler başarısız olursa
    1. Scriptleri tekrar tekrar koştururuz
    2. manuel testing yapıyoruz
    3. Business Analist (BA)  ve Urunun sahibi belirler (Acceptance Criteria)
    Bir TESTER olarak bizim görevimiz dokumanlarda bulunan yanlışları düzeltmek değildir.
    Bizim misyonumuz bug veya kusur bulacak script (kod) yazmak,


 */



}
