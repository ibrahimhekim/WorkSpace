package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        /*try {
            File dosya = new File("patika.txt");
            dosya.createNewFile();

            FileInputStream fileInputStream = new FileInputStream("patika.txt");
        } catch (Exception e) {     //FileNotFoundException
            System.out.println(e.getMessage());
        }*/


        try {
            FileInputStream input = new FileInputStream("patika.txt");

            input.skip(15);     //15 karakter atla ve öyle say.
            
            /*int a = input.read();
            while (a != -1) {
                System.out.print((char) a);
                a = input.read();
            }*/

            input.read();
            input.read();           //her okumada karakter sayisi eksilir!!
            input.read();

            System.out.println("karakter sayisi : " + input.available());
            input.close();  //stack de calisma devam etmesin diye kapatalim.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
