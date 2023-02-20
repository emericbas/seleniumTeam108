package practise.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Q5 {
    // .......Exercise5........
    /*
    Navigate to website https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    click on Alerts
    print the URL
    navigate back
    print the URL
    Click on Basic Ajax
    print the URL
    enter value 20 and ENTER
    and then verify Submitted Values is displayed open page
    close driver
     */
    public static void main(String[] args) {


        //  Navigate to website https://testpages.herokuapp.com/styled/index.html
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com");

        //  Under the ORIGINAL CONTENTS
        //  click on Alerts
        driver.findElement(By.xpath("//a[text()='Alerts']")).click();
        //  print the URL
        System.out.println("CurrentUrl : "+driver.getCurrentUrl());
        //  navigate back
        driver.navigate().back();
        //  print the URL
        System.out.println("CurrentUrl : "+driver.getCurrentUrl());
        //  Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        //  print the URL
        System.out.println("CurrentUrl : "+driver.getCurrentUrl());
        //  enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        //  and then verify Submitted Values is displayed open page
        WebElement submittedValues=driver.findElement(By.xpath("//*[text()='Submitted Values']"));
        if(submittedValues.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        //  close driver
        driver.close();
    }
}