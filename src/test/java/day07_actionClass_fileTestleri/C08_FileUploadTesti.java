package day07_actionClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08_FileUploadTesti extends TestBase {
    /*
    1.https://the-internet.herokuapp.com/upload adresine gidelim
2.chooseFile butonuna basalim
3.Yuklemek istediginiz dosyayi secelim.
4.Upload butonuna basalim.
5.“File Uploaded!” textinin goruntulendigini test edelim.
 6.Daha once download'a indirdigimiz logo.png dosyasini yukleyelim
     */
    @Test
    public void test01(){
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //chooseFile butonuna basalim
        //Yuklemek istediginiz dosyayi secelim.
        //Downloads'a indirdigimiz logo.png dosyasini yukleyelim

        /*
            chooseFile butonuna basarsak
            bilgisayarimizdan bir dosya secme islemi yapmamiz gerekir
            Ancak selenium veya java bilgisayarimizdan dosya secme islemi yapamaz
            Bunun yerine Selenium bize bir yontem gelistirmistir
            chooseFile ile secmemiz gereken dosyanin dosya yolunu olusturup
            olusturulan dosya yolunu sendKeys ile chooseFile butonuna gondermemiz yeterli olur
         */
     bekle(5);

    }
}
