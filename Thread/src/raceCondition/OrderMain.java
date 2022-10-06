package raceCondition;

import java.util.ArrayList;
import java.util.List;
public class OrderMain {
    public static void main(String[] args) {
        /*OrderMatic orderMatic = new OrderMatic();
        Thread t1 = new Thread(orderMatic);
        t1.start();*/

        OrderMatic oMatic = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();
        for (int i=0; i<20; i++){
            Thread t = new Thread(oMatic);
            islemler.add(t);
            t.start();
        }
    }
}
