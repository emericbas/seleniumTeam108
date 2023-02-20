package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RelativeLocaters {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html\n");

        WebElement berlinElementi = driver.findElement(By.xpath("//*[@*='pid7_thumb']"));
        WebElement nycElementi = driver.findElement(By.xpath("//*[@*='pid3_thumb']"));
        WebElement bostonElementi = driver.findElement(By.xpath("//*[@*='pid6_thumb']"));
        WebElement seilorElementi = driver.findElement(By.xpath("//*[@*='pid11_thumb']"));

        /*
        Selenium4 ile yeni gelen bir ozellik
        Olur da bir elementi locate edemezseniz
        2 sey ile o elementi locate edebiliriz
            1- etrafindan bir web element(sag,sol,ustunde,altinda veya yakininda)
            2- locate edemedigimiz webElement'e ait bir ozellik (tag,attribute)
         */
    }
}
