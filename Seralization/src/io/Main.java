package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("Audi", "A3"); //urettigimiz bu nesneyi bir dosyada tutacagiz.

        try {
            //dosyayi olustururuz. veri dosya uzerinden okunacak. bu yuzden once bunu yazariz.
            FileOutputStream outputFile = new FileOutputStream("araba.txt");

            ObjectOutputStream output = new ObjectOutputStream(outputFile);

            output.writeObject(c1);   //c1 object veri tipinde
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
