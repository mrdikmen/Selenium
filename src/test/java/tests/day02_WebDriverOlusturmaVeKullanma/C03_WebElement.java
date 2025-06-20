package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu sayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //arama kutusuna "phone" yazip aratin

        //Bir web elementi kullanmak istedigimizde
        //1-
        // ilk yapmamiz gereken sey
        //o webElementin HTML kodlarini incelemek
        //ve unique olarak o webElementi tarif edebilecegimiz
        //bir ozelligini bulmak

        //arama kutusunun HTML kodunu inceledigimizde id=global-search oldugunu
        //ve id=global-search olan unique element oldugunu gorduk.

        //2-
        //unique adresini buldugumuz HTML elementi
        //driver' a tarif edip, bunu kodlarimiz icinde
        //kullanacagimiz bir obje olarak kaydetmek.

        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone");
        aramaKutusu.submit();

        //arama sonucunda urun bulunabildigini test edin

        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));

        //arama sonucunu yazdirip gorelim
        System.out.println(aramaSonucElementi);
        //[[ChromeDriver: chrome on windows (861913f9b8a9df032f83f8f47da2c311)] -> class name: product-count-text]
        //aramaSonucElementi_in data turu WebElement
        //WebElement non-primitive data turu oldugundan
        //yazdirdigimizda bize referansini verir
        //eger webElement uzerindeki yaziyi istiyorsak
        System.out.println(aramaSonucElementi.getText());   //4 Products Found

        //bu yazidan urunun bulunabildigini test edelim
        //urun bulunamazsa yazi "0 Products Found" oluyor
        //eger bu yazi gorunuyorsa TEST FAILED olur
        //gorunmuyorsa TEST PASSED olur

        String unExpectedSonucYazisi="0 Products Found";
        String actualSonucYazisi = aramaSonucElementi.getText();

        if (actualSonucYazisi.equals(unExpectedSonucYazisi)){
            System.out.println("TEST FAILED");
        }else System.out.println("TEST PASSED");

        //sayfayi kapatin

        Thread.sleep(5000);
        driver.quit();

    }
}
