package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

//InputSteamReaderMain
public class Main2 {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("patika.txt");

            InputStreamReader inputReader = new InputStreamReader(inputFile);
            //InputStreamReader inputReader = new InputStreamReader(inputFile, "UTF8");
            //InputStreamReader inputReader = new InputStreamReader(inputFile, Charset.forName("UTF8"));

            System.out.println("Karakter Setimiz : " + inputReader.getEncoding());


            int i = inputReader.read();
            while (i!=-1){
                System.out.print((char) i);
                i = inputReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
