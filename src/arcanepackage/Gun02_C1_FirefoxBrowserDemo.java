package arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gun02_C1_FirefoxBrowserDemo {
    /*
    https://www.mozilla.org/en-US/firefox/new/
    https://github.com/mozilla/geckodriver/releases
    Yeni sinif olustur : FirefoxBrowserDemo
    Main method olustur
    Set Path
    Gecko driver olustur
    Ac : google home page https://www.google.com/
    Maximize the window
    Close/Quit the browser
     */
    public static void main(String[] args) {
        //Path i set et
        System.setProperty("webdriver.gecko.driver","C:/Users/ustab/Documents//selenium dependencies/drivers/geckodriver.exe");

        // Obje oluştur
        WebDriver driver=new FirefoxDriver();

    //    Ac : google home page https://www.google.com/
        driver.get("https://www.google.com/");

//        Maximize the window
        driver.manage().window().maximize();

//        Close/Quit the browser
        driver.close();


        /*
        get() ant navigate().to()
        1.get() daha yaygın kullanılır
        2.get() daha hızlı çalışır
        3.get() YALNIZCA parametre olarak String alır fakat navigat().to() hem String hem de URL i parametre olarak alabilir
        4. navigate() daha fazla method ortaya cıkar(farword, to, back, refresh...

        close() ile quit() arasındaki fark
        1. close() yalnızca çalıştığımız browseri kapatır
        2.quit calışılan tüm prowserları kapatır. quit sağlam kapatır

        Java ya bekleme (wait ) ekleme
        1. Thread.sleep(5000) bir sonraki adıma gecmeden 5 saniye bekleme
        2. bu bekleme Javanın kendisine aittir. Selenium a ait degildir.
            bu nedenle Thread.sleep() kullanımı tavsiye edilmez( Hard wait denir)
            Note:  "selenium wait" daha dinamik bir beklemedir
            bu selenium bekle daha hızlıdir extra bir zaman beklemez

         */

    }

}
