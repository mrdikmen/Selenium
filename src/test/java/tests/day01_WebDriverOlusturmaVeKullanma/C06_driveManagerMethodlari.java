package tests.day01_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_driveManagerMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.quit();
    }
}
