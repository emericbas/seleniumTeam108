package practise.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    //Thread.sleep() java'nin bir methodu,burada program yazildigi surece durur,isleme bagli degil
    //implicitlyWait  selenium'un bir methodu, max bekleme suresi oncesinde program calisirsa yoluna devam eder,
    // calismazsa program durur ve exception firlatmak zorundayiz
    /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
        WebDriver driver ;
        @Before
    public  void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));}
        @After
          public void teardown(){
            driver.close();
            }
        @Test
           public void test01(){

        driver.get("https://www.otto.de");
       String expectedTitle="OTTO";
       String actualTitle=driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Test
    public void test02(){
            String expectedUrl="OTTO";
            String actualUrl=driver.getCurrentUrl();
            Assert.assertFalse(actualUrl.contains(expectedUrl));
    }
    @Test
    public void test03(){
            driver.get("https://wisequarter.com/");

            String expectedTitle="Quarter";
            String actualTitle= driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Test
    public void test04(){
            driver.navigate().back();
            driver.navigate().refresh();
            driver.navigate().forward();
    }

}