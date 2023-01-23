package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        byte[] inputByteArray = {4,75,124,13,47,2,90};
        ByteArrayInputStream input = new ByteArrayInputStream(inputByteArray);
        ByteArrayInputStream input2 = new ByteArrayInputStream(inputByteArray,2,4);

        System.out.println("ilk input icin kullanilabilir byte sayisi : " + input.available());
        System.out.println("ikincisi icin : " + input2.available());
        System.out.println("ikinci inputun araliklari : ");

        int deger = input2.read();
        while (deger!= -1){
            System.out.println(deger);
            deger = input2.read();
        }
        try {
            input2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
