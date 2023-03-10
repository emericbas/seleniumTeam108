package day07_actionClass_fileTestleri;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class PresantationActionsGuzelSoru extends TestBase {
/*  Yeni Class olusturun ActionsClassHomeWork
1- "http://webdriveruniversity.com/Actions" sayfasina gidin
2- Hover over Me First" kutusunun ustune gelin
            3- Link 1" e tiklayin
            4- Popup mesajini yazdirin
5- Popup'i tamam diyerek kapatin
            6- “Click and hold" kutusuna basili tutun
            7-“Click and hold" kutusunda cikan yaziyi yazdirin
            8- “Double click me" butonunu cift tiklayin

   */
    @Test
    public void test01() {


        //  1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //  2- Hover over Me First" kutusunun ustune gelin
        WebElement meFirstButton=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        Actions action=new Actions(driver);
        action.moveToElement(meFirstButton).perform();

        // 3- Link 1" e tiklayin
      driver.findElement(By.linkText("Link 1")).click();
        // 4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        // 5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        // 6- “Click and hold" kutusuna basili tutun
WebElement clickAndHold=driver.findElement(By.xpath("//div[@id='click-box']"));
action.clickAndHold(clickAndHold).perform();
        // 7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.xpath("//div[@id='click-box']")).getText());

        // 8- “Double click me" butonunu cift tiklayin
WebElement doubleClickMe=driver.findElement(By.xpath("//*[text()='Double Click Me!']"));
action.doubleClick(doubleClickMe).perform();
    }
}
