package day07_actionClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;
import java.util.Set;

public class KeyboardActionGuzelSoru extends TestBase {
       /* 1- Bir Class olusturalim KeyboardActions2
2- https://html.com/tags/iframe/ sayfasina gidelim
            3- video’yu gorecek kadar asagi inin
4- videoyu izlemek icin Play tusuna basin
5- videoyu calistirdiginizi test edin

        */
    @Test
    public void test01(){
//  1- Bir Class olusturalim KeyboardActions2
//2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
//   3- video’yu gorecek kadar asagi inin
        WebElement iframe=driver.findElement(By.xpath("//iframe[@width='560']"));
        driver.switchTo().frame(iframe);
        String ilkWindowHandle=driver.getWindowHandle();
        //4- videoyu izlemek icin Play tusuna basin
        WebElement youtube=driver.findElement(By.xpath("//div[@class='ytp-impression-link-logo']"));
        Actions actions =new Actions(driver);

       actions.scrollToElement(youtube).perform();
        driver.findElement(By.xpath("//div[@class='ytp-impression-link-logo']")).click();
driver.switchTo().parentFrame();
//5- videoyu calistirdiginizi test edin
        String ikinciWindowHandle="";
        Set<String> windowHandles=driver.getWindowHandles();
        for (String each:windowHandles
             ) {
            if(!each.equals(ilkWindowHandle)){
                ikinciWindowHandle=each;
            }
            driver.switchTo().window(ikinciWindowHandle);
            String actualTitle= driver.getTitle();
            String expectedIcerik="Massive";
            Assert.assertFalse(actualTitle.contains(expectedIcerik));
        }


    }
}
