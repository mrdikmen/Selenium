package tests.day01_WebDriverOlusturmaVeKullanma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_farkliDriverKullanimi {
    public static void main(String[] args) throws InterruptedException {

        /*
            Eger calistigimiz firma
            Selenium WebDriver yerine, kendi belirledikleri spesifik bir webdriver
            kullanmamizi isterse, bu webdriver' i projemize eklemeliyiz

         */

        // WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(3000);
        driver.quit();
    }
}
