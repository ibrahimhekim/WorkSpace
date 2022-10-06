package raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolMain {
    public static void main(String[] args) {
        OrderMatic oMatic = new OrderMatic();
        ExecutorService pool = Executors.newFixedThreadPool(20);

        for (int i=0; i<100; i++){
            pool.execute(oMatic);
        }
        System.out.println(oMatic.getOrderNo());
    }
}
