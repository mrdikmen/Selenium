package tests.day03_locators_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotomasyonu ana sayfaya gidin
      driver.get("https://www.testotomasyonu.com");

        //phone icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        //aramaKutusu.submit();


        //arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));
        String unExpectedSonucYazisi = "0 Procuts Found";
        String actualSonucYazisi = aramaSonucElementi.getText();

        if (actualSonucYazisi.equals(unExpectedSonucYazisi)){
            System.out.println("Urun bulma testi FAILED");
        }else System.out.println("Urun bulma testi PASSED");
        //bulunan urunlerden ilkini tiklayin
        /*
        class attribute' u GENEL OLARAK AYNİ gorunume sahip
        Webelementleri gruplandirmak icin kullanilir
        bu durumda locate unique olmaz, o gorunume sahip kac eleman varsa hepsini isaret eder
         */
        List<WebElement> bulunanUrunElementleriList = driver.findElements(By.className("prod-img"));

        bulunanUrunElementleriList.get(0).click();

        //By.classname locator' i kullanirken
        //yazdigimiz locate' de space olmamasina dikkat etmemiz gerekir
        //eger locate' de space varsa By.classname SAGLIKLI calismaz

        //acilan urun sayfasindaki urun aciklamasinda
        //case sensitive olmaksizin "phone" bulundugunu test edin

        //WebElement urunSayfasindaAciklamaElementi = driver.findElement(By.className("prod-detail"));

        //WebElement urunSayfasindakiAciklamaElementi=


        //sayfayi kapatin
        Thread.sleep(1500);
        driver.quit();

    }
}
