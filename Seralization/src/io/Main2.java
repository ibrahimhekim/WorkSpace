package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {
        Car c2 = new Car("Fiat", "Doblo");  //bir onemi yok. c1 inputa yazildi.
                                                    // inputFile araba.txt nin içindeki veri neyse onu okuyacak.

        try {
            FileInputStream inputFile = new FileInputStream("araba.txt");
            ObjectInputStream inputObj = new ObjectInputStream(inputFile);

            //Objeyi tek tek okuyacagiz. bunun icin readObject() ile gelen nesne tipini Car tipine dondurecegiz.
            //Geriye Car turunde bir deger dondugu icin yeni bir Car nesnesi olustururuz.
            Car newCar = (Car) inputObj.readObject();

            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            
            inputObj.close();
            inputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
