package JAVA;

public class Main {

    public static void main(String[] args) {
	/*MultithreadThing myThing = new MultithreadThing();
    MultithreadThing myThing2 = new MultithreadThing();

    myThing.run();      //run ile bir nesne bitmeden digeri baslamaz
    myThing2.run();     //start ile aynı anda paralel calisilir */

        //extend ederek yapilabilen yontem
        /*for (int i = 1; i <= 4; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }*/

        //implement islemi
        for (int i = 1; i <= 4; i++) {
            MultithreadThingOther myThingOther = new MultithreadThingOther(i);
            Thread myThread = new Thread(myThingOther);
            myThread.start();

            if (myThread.isAlive()){//Oluşturulan thread sınıfının halen çalışıp çalışmadığını kontrol eder.true aktif.
                System.out.println("thread giris");//aktif
            }else System.out.println("thread cikis");

            try {
                System.out.println("joine giris");
                myThread.join();
                System.out.println("joinden cikis");
            } catch (InterruptedException e) {
            }

            if (myThread.isAlive()){//Oluşturulan thread sınıfının halen çalışıp çalışmadığını kontrol eder.true aktif.
                System.out.println("thread giris");
            }else System.out.println("thread cikis");//aktif
            System.out.println("--------------------------");
        }
    }
}
