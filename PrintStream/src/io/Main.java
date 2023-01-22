package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        System.out.println("PrintStream Sinifinin metotlarini kullaniriz sout'ta.");

        try {
            PrintStream outPrint = new PrintStream("print.txt");

            outPrint.print("123" + 222);
            outPrint.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}