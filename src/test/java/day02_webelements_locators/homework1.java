package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework1 {
    public static void main(String[] args) throws InterruptedException {
    //    1.Yeni bir class olusturalim (Homework)
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //   2.ChromeDriver kullanarak, facebook sayfasina gidin ve
        //   sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        //   degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String expectedIcerik="facebook";
        String actualTitle=driver.getTitle();
        if(actualTitle==expectedIcerik){
            System.out.println("Title facebook, test passed");
        }else{System.out.println("Title is not facebook,test failed "+"\n Actual Title :"+actualTitle);}

    //  3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL facebook iceriyor,test passed");
        }else{
            System.out.println("URL facebook icermiyor,test failed \nActual URL: "+actualUrl);
        }
    //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        Thread.sleep(300);
    //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitleWalmart="Walmart.com";
        String actualTitleWalmart=driver.getTitle();
        if(actualTitleWalmart.contains(expectedTitleWalmart)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }


    //    6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);
     //   7. Sayfayi yenileyin
        driver.navigate().refresh();
   // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
     //   9.Browser’i kapatin
        driver.close();

    }
}
