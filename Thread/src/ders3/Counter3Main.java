package ders3;

public class Counter3Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter3("c1",1));
        t1.start();

        Thread t2 = new Thread(new Counter3("c2",2));
        t2.start();
    }
}
