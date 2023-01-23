package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class OutputMain {
    public static void main(String[] args) {

        String data = "Java 102 Patikasi Devam Ediyor.";

        try {
            FileOutputStream outputFile = new FileOutputStream("patika.txt");

            BufferedOutputStream outputBuff = new BufferedOutputStream(outputFile);

            byte[] byteData = data.getBytes();
            outputBuff.write(byteData);
            outputBuff.close();
            outputFile.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
