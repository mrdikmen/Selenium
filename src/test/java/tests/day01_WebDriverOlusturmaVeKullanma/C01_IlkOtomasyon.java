package tests.day01_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) throws InterruptedException {

        /*
            Selenium ile test otomasyonu yapmak icin
            elimiz ve gozumuzle, klavye ve mouse kullanarak yapabilecegimiz
            COGU islemi bizim yerimize
            Selenium WebDriver objesi ile yapar

            YANNİİİİİ
            bir test otomasyonu yapmak istedigimizde
            ILK YAPMAMIZ GEREKEN sey
            bir Webdriver objesi EDINMEKTIR.

         */

        //WebDriver driver=new WebDriver();
        //'WebDriver' is abstract; cannot be instantiated
        //WebDriver bir interface' dir ve
        //interface' lerden direkt olarak obje olusturulamaz.

        //obje olusturmak icin child class' larinin constructor' i kullanilabilir.

        WebDriver driver=new ChromeDriver();

        //driver.get("URL") yazdigimiz URL' e goturur
        driver.get("https://www.testotomasyonu.com");

        /*
            Notlar:
            1- Consolda gorulen her kirmizi yazi Java' daki gibi hata anlamina gelmez
            Consolda
                "Process finisher with exit cone 0" yazisi varsa
                kod sorunsuz olarak calisip bitti demektir.

            2- WebDriver olustursak ama
            objeyi hic kullanmasak
            Selenium bos bir browser olusturur
            ve emirlerinizi bekler

            3- Selenium bilgisayarimizda var olan browser' i degil
                var olan browser' in Selenium tarafindan olusturulan
                kopyasini kullanir.
                driver objesinin actigi browser' in basinda
                "Chrome is being controlled by automated software" yazar

            4- url adresi yazarken www kullanmazsak da driver istenen url' e gider
            AMMAAAAA "https" yazilmazsa kod calismaz

            5- Olusturulan driver objesi gorevi bitirdiginde, kapatilmalidir.
                kapatma icin  driver.close() veya driver.quit() kullanilabilir

                ikisi arasindaki fark:
                driver.close(); : test sirasinda birden fazla window acilirsa,
                                  sadece son kullandigini kapatir, oncekiler acik kalir.
                                  (sadece 1 window aciliyorsa sorun yok)
                driver.quit();  : test sirasinda birden fazla window acilirsa,
                                  kendi actigi tum window' lari kapatir.

            6- Otomasyonla calistirilan testlerin
                mumkun oldugunca kisa sure icinde bitmesi tercih edilir
                ANCAKKK test adimlarinizi gormek veya
                bir sunum sirasinda test adimlarinizi gostermek isterseniz
                kodlari Thread.sleep() ile belirli bir sure bekletebilirsiniz.

                Thread.sleep() compile time exception uyarisi vrir
                ya throws kullanmaliyiz ya da try-catch ile exception' i handle etmeliyiz.

                7- Test uzerinde ilk calisirken veya
                sunum yaparken koyacagimiz Thread.sleep()' leri
                calismamiz bittiginde silmemizde fayda var.
                silmezsek toplu calistirmalarda
                gereksiz yere ciddi zaman kaybi olacaktir.

         */
        Thread.sleep(3000); //3000 milisaniye = 3 saniye
        //driver.close();
        driver.quit();
    }
}
