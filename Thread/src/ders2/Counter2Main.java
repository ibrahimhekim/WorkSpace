package ders2;

public class Counter2Main {

    public static void main(String[] args) {
        Counter2 co1 = new Counter2("c1");
        Counter2 co2 = new Counter2("c2");
        Counter2 co3 = new Counter2("c3");

        Thread t1 = new Thread(co1);
        Thread t2 = new Thread(co2);
        Thread t3 = new Thread(co3);

        t1.start();
        t2.start();
        t3.start();
    }
}
