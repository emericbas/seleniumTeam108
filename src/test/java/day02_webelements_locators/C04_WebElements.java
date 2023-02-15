package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //arama kutusunu locate edip ,bir webelement olarak kaydedin
        //id'si twotabsearchtextbox olan webelement seklinde locate edecegiz
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));//adina locate islemi denir

        /*
        driver'a webelementi tarif etme islemine LOCATE
        bu tarifi yapabilmek icin kullanabilecegimiz degiskenlere de LOCATOR denir

        8 tane Locator vardir
        Locator'larin 6 tanesi webelementin ozelliklerine baglidir
        - id
        - classname
        - name
        - tagname
        - linkText
        - partialLinkText
       Geriye kalan  2 Locator ise her turlu webelement'i locate etmek icin kullanilabilir
       - xpath
       - cssSelector
         */

        //arama kutusuna "Nutella" yazip aratin
        aramaKutusu.sendKeys("Nutella");// Nutella yazisini gonderdik
        aramaKutusu.submit();// enter'a bas demek

        Thread.sleep(3000);
        driver.close();

    }
}
