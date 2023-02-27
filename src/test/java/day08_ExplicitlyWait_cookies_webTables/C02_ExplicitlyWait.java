package day08_ExplicitlyWait_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_ExplicitlyWait {

    /*  2. Bir metod olusturun : isEnabled()
  3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    4. Textbox’in etkin olmadigini(enabled) dogrulayın
  5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
  6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
  7. Textbox’in etkin oldugunu(enabled) dogrulayın.

     */
    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // arama kutusu clickable oluncaya kadar bekleyin
        // explicitly wait icin
        //  A- wait objesi olustur
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        // B - mumkunse webelementi locate et
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // C- wait objesini kullanarak istenen gorev icin bekle
        wait.until(ExpectedConditions.elementToBeClickable(aramaKutusu));
        // Nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}