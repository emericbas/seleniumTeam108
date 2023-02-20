package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ZeroTest {
@Test
    public  void test1(){
/*    1. http://zero.webappsecurity.com sayfasina gidin
            2. Signin buttonuna tiklayin
3. Login alanine  “username” yazdirin
4. Password alanine “password” yazdirin
5. Sign in buttonuna tiklayin
6.Back tusu ile sayfaya donun
7.online Banking menusunden Pay Bills sayfasina gidin
8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
9. tarih kismina “2020-09-10” yazdirin
10. Pay buttonuna tiklayin
11. “The payment was successfully submitted.” mesajinin ciktigini test edin

 */WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    driver.get("http://zero.webappsecurity.com");
driver.findElement(By.xpath("//button[@id='signin_button']")).click();
driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.navigate().back();
driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
driver.findElement(By.id("sp_amount")).sendKeys("2000");
driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
driver.findElement(By.id("pay_saved_payees")).click();
String expectedResult="The payment was successfully submitted.";
String actualResult=driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']")).getText();
    Assert.assertEquals(expectedResult,actualResult);
    driver.close();
   /* WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  // 1. http://zero.webappsecurity.com sayfasina gidin
    driver.get(" http://zero.webappsecurity.com");

  // 2. Signin buttonuna tiklayin
    driver.findElement(By.id("signin_button")).click();
  // 3. Login alanine  “username” yazdirin
    driver.findElement(By.id("user_login")).sendKeys("username");
  // 4. Password alanine “password” yazdirin
    driver.findElement(By.id("user_login")).sendKeys("password");
  // 5. Sign in buttonuna tiklayin
    driver.findElement(By.xpath("//input[@name='submit']")).click();
  //  6.Back tusu ile sayfaya donun
    driver.navigate().back();
  // 7.Online Banking menusunden Pay Bills sayfasina gidin
    driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
    driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();
  // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
    driver.findElement(By.id("sp_amount")).sendKeys("200");
  // 9. tarih kismina “2020-09-10” yazdirin
    driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
  // 10. Pay buttonuna tiklayin
    driver.findElement(By.id("pay_saved_payees")).click();
  // 11. “The payment was successfully submitted.” mesajinin ciktigini test edin
    WebElement mesajElementi=driver.findElement(By.id("alert_content"));
    if(mesajElementi.isDisplayed()){
        System.out.println("Test PASSED");
    }else{
        System.out.println("Test FAILED");
    }
    driver.close();

    */
}
}
