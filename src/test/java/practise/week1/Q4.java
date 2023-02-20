package practise.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4 {
    /* ...Exercise4...
Navigate to  https://testpages.herokuapp.com/styled/index.html
Click on  Calculater under Micro Apps
Type any number in the first input
Type any number in the second input
Click on Calculate
Get the result
Print the result
     */
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("20");
        driver.findElement(By.id("function")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("2");
driver.findElement(By.id("calculate")).click();
        System.out.println(driver.findElement(By.xpath("//span[text()='22']")).getText());
        driver.close();
    }

}
