package ders4;

public class Counter4Main {
    public static void main(String[] args) throws InterruptedException {
        Counter4 coun1 = new Counter4("coun1",1);
        Counter4 coun2 = new Counter4("coun2",2);

        Thread t1 = new Thread(coun1);
        t1.start();
        Thread.sleep(2000);
        coun1.stop();

        Thread t2 = new Thread(coun2);
        t2.start();
        Thread.sleep(4000);
        coun2.stop();
    }
}
