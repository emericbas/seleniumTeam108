package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class homework6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.bestbuy.com adresine gidin
        driver.get("https://www.bestbuy.com");
        //2- cookies cikarsa kabul et butonuna basin
       // 3- sayfada kac tane button bulundugunu yazdirin
       List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        System.out.println(buttonList.size());

        //4- sayfadaki herbir buttonun uzerindeki yazilari yazdirin
        for (WebElement each:buttonList
             ) {
            System.out.println(each.getText());

        }
        Thread.sleep(3000);
        driver.close();
    }
}
