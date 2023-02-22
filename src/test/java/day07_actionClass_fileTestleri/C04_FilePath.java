package day07_actionClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    @Test
    public void test01(){
      // bilgisayarimizin temel dosya yolu ==>  user.home

        //masaustundeki dosyanin yolu
        //"C:\Users\ebasm\OneDrive\Desktop\TheDelta.docx"


        //icinde bulundugumuz projenin temel yolu===>  user.dir
        //C:\Users\ebasm\IdeaProjects\seleniumTeam108

        //C:\Users\ebasm\IdeaProjects\seleniumTeam108\src\test\java\day07_actionClass_fileTestleri\text.txt

        String dosyaYolu="C:\\Users\\ebasm\\OneDrive\\Desktop\\TheDelta.docx";
        boolean sonuc= Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);
        /*
 Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var
            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir
            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz


         */
        System.out.println(System.getProperty("user.home"));//C:\Users\ebasm

        dosyaYolu="C:\\Users\\ebasm\\OneDrive\\Desktop\\TheDelta.docx";
        dosyaYolu=System.getProperty("user.home")+"\\OneDrive\\Desktop\\TheDelta.docx";
        System.out.println(System.getProperty("user.dir"));
    }
}
