package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework2 {
    public static void main(String[] args) throws InterruptedException {

    //    1. Let's create a new Class.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   //   2. Let's go to the Amazon page. https://www.amazon.com/
        driver.get("https://www.amazon.com");
   //   3 . Print the position and dimensions of the page
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //   4. Minimize the page
        driver.manage().window().minimize();
   //   5. Wait 3 seconds in the icon state and maximize the page
        Thread.sleep(300);
        driver.manage().window().maximize();
   //   6. Print the position and dimensions of the page in maximized state
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //   7 . Make the page fullscreen
        driver.manage().window().fullscreen();
   //   8 . Print the position and dimensions of the page in fullscreen state
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //   9 . close the page
        driver.close();

    }
}
//<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">
// control c den sonra control f yaparsak arama cubugunun icine yazip kackez gectigini goruruz