package JAVA;

public class MultithreadThingOther implements Runnable{

    private  int threadNumber;
    public MultithreadThingOther(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i =1;i<=3;i++){
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
