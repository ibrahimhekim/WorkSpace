package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String yazi = "OutputStream Ogreniyorum.\nPatika Dev";

        try {
            File dosya = new File("patika.txt");    //proje altinda dosya olusturulur.

            //olusturulan dosyaya yazi yazabilmek icin output u cagirdik.
            FileOutputStream output = new FileOutputStream(dosya ,true); //dosya yerine "patika.txt" yazilabilirdi
                                                          //true: kodun uzerine degil devamina yazilmasini saglar.
            byte[] yaziByte = yazi.getBytes();  //yazi byte formuna cevrildi
            output.write(yaziByte);
            output.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
