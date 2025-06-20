package tests.day01_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //testotomasyonu anasayfaya gidin

        driver.get("https://testotomasyonu.com");
        Thread.sleep(1000);

        //wisequarter anasayfaya gidin

        driver.navigate().to("https://wisequarter.com");
        Thread.sleep(1000);
        //tekrar testotomasyonu anasayfaya geri donun

        driver.navigate().back();
        Thread.sleep(1000);
        //yeniden wisequarter anasayfaya gidin

        driver.navigate().forward();
        Thread.sleep(1000);
        driver.quit();
    }
}
