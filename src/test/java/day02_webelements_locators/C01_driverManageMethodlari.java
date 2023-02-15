package day02_webelements_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        System.out.println("Ilk size: "+driver.manage().window().getSize());
        System.out.println("Ilk position : "+driver.manage().window().getPosition());
        Thread.sleep(3000);

        //olculeri ve konumu degistirelim
        driver.manage().window().setSize(new Dimension(800,800));
        driver.manage().window().setPosition(new Point(40,100));
        Thread.sleep(2000);

    }
}
