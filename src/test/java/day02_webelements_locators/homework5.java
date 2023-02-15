package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework5 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //facebook'a git
        driver.get("https://www.facebook.com");

       //cookies cikarsa kabul et butonuna basin
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();

       //  e-posta kutusuna rastgele bir email girin
        WebElement epostaKutusu= driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
        epostaKutusu.sendKeys("er78nbfgt");

       //  sifre kismaina rastgele bir sifre girin
        WebElement sifre=driver.findElement(By.xpath("//input[@id='pass']"));
        sifre.sendKeys("12345");
       //  giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();

       //  uyari olarak "The email or mobile number you entered isn't connected to an account.Find your account"mesajinin ciktigini test edin
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedResult="The email or mobile number you entered isn't connected to an account.Find your account and log in";
        String actualRseult= sonucYaziElementi.getText();
        if(actualRseult==expectedResult){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
       //  sayfayi kapatin
        driver.close();
    }
}
