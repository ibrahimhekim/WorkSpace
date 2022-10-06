package raceCondition;

public class OrderMatic implements Runnable{

    private int orderNo;
    //private final Object Lock = new Object();

    public OrderMatic() {
        this.orderNo = orderNo;
    }

    @Override
    public void run() {
        /*synchronized (Lock){
            this.orderNo++;
            System.out.println(Thread.currentThread().getName() + " - OrderNo => " + this.orderNo);
        }*/

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        increaseOrder();
    }

    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " - OrderNo => " + this.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
