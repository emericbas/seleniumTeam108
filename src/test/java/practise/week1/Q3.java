package practise.week1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */
    public static void main(String[] args) throws InterruptedException {

        WebDriver   driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        driver.navigate().refresh();

driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Emine");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bas");
driver.findElement(By.xpath("//input[@name='sex']")).click();
driver.findElement(By.xpath("//input[@value='5']")).click();
driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("19-02-2023");
Thread.sleep(3000);
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
driver.findElement(By.id("profession-1")).click();
driver.findElement(By.id("tool-2")).click();
driver.findElement(By.xpath("//select[@class='input-xlarge']")).sendKeys("Antartica");
driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
jse.executeScript("window.scrollBy(0,350)");

driver.findElement(By.xpath("//button[@id='submit']")).submit();
            driver.close();
}}



