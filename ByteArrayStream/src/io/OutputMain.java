package io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputMain {
    public static void main(String[] args) {

        String data = "Java 102 Dersleri!";
        byte[] dataByteArray = data.getBytes(); //data byte formuna cevrildi

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            output.write(dataByteArray);

            String newData = output.toString();     //byte turundeki array ler okunur
            System.out.println("Cikis Akisi : " + newData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
