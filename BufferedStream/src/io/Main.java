package io;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String yazi = "Yeni birseyler denemek istiyorum.\n";

        try {
            File dosya = new File("patika.txt");

            FileOutputStream outputFile =new FileOutputStream(dosya, true);
            byte[] yaziByte = yazi.getBytes();
            outputFile.write(yaziByte);
            outputFile.close();


            FileInputStream inputFile = new FileInputStream(dosya);

            BufferedInputStream inputBuff = new BufferedInputStream(inputFile);

            int i =inputBuff.read();
            while (i!=-1){
                System.out.print((char)i);

                i = inputBuff.read();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
