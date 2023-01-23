package io;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File dosya = new File("src/patika.txt");
        /*try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + " dosyasi olusturuldu");
            } else {
                System.out.println(dosya.getName() + " dosyasi zaten mevcut");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
        //System.out.println(dosya.delete());

        File dizin = new File("test");
        dizin.mkdir();  //once dizin olusturuldu...
        File dosya2 = new File("test/patika.txt");  //...bu sayede belirtilen path...
        try {
            dosya2.createNewFile();                       //...dosyayi olusturabildi.
        } catch (IOException e) {
            e.printStackTrace();
        }


        File dizin2 = new File("patika/dev");       //dizini komple olusturabildik..
        dizin2.mkdirs();

        File dizin3 = new File("test");
        String[] liste = dizin3.list();

        for (String str : liste){
            System.out.println(str);
        }
    }
}
