package tests.day01_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getTitle());  //Test Otomasyonu - Test Otomasyonu

        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl()); //https://www.testotomasyonu.com/

        driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());   //C9707415A63ABFE1C789BB02C490FB52
        driver.getWindowHandles();
        System.out.println(driver.getWindowHandles());  //[C9707415A63ABFE1C789BB02C490FB52]

        /*
        Selenium bilgisayarimizda var olan browser' lari degil
        kendi olusturdugu kopya browser' lari kullanir.

        her olusturdugu kopya browser' a da
        Unique bir handle degeri atama yapar

        Eger test sirasinda sadece bir window acildiysa
        ikisi de ayni degeri getirir, farklari

        getWindowHandle() driver' in handle degerini direkt string olarak getirirken
        getWindowsHandle() driver' in handle degerini bir Set olarak getirir.

        Eger test sirasinda sadece birden fazla window acildiysa
        ikisi farkli degerleri getirir

        getWindowHandle() driver' in son actigi browser' in handle degerini getirirken
        getWindowsHandle() driver' in actigi tum window' larin
        window handle degerini bir Set olarak getirir.

        Window handle degeri
        test sirasinda birden fazla window acildiginda
        bu window' lar arasinda gecis icin kullanilir.
         */

        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //html sayfanin tum kaynak kodlarini getirir.
        //sayfa kaynaginda otomasyon kelimesi geciyor mu gibi bir test yapilacaksa kullanilabilir.


        Thread.sleep(3000);
        driver.quit();
    }
}
