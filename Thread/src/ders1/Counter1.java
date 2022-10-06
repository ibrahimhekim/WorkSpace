package ders1;

public class Counter1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
