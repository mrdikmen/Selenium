package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_MahserinUcAtlisi {

    //Otomasyon icin bir class olusturdugumuzda
    //ilk yapmamiz gereken sey bir webDriver olusturmak
    //ve gerekli ayarlari yapmaktir.
    //Biz bu islem icin 3 satir kod yazacagiz
    //Bunu Mahserin 3 Atlisi olarak adlandiriyoruz

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //sirket ozel bir webdriver verirse bu mahserin 4. atlisi olur

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //implicitylWait bilgisayarimiz, internetimiz veya baglandigimiz
        //web sayfasinin server' indaki yavasliklari tolere eder
        //yazdigimiz 10 saniye tolere edecegi max suredir.
        //asil odak noktasi bekleme degil, islemin yapilmasidir.
        //islem verilen zaman araligi icinde ne zaman biterse
        //daha fazla beklemeden yoluna devam eder.
        //eger verilen sure icinde islem tamamlanmazsa
        //exception firlatir ve calismayi durdurur.

        //Thread.sleep() de bekleme yapar ama tam da istedigimiz islemi yapmaz.
        //kendisine verilen sure kadar kodlari bekletir
        //islem yapilmis olsa bile kodlari bekletmeye devam eder
        //bunun icin toplu calistirmalarda kullanissizdir.



    }

}
