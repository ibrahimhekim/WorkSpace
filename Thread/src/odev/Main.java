package odev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> sayilar = new ArrayList<>();
        List<Integer> tekSayilar = new ArrayList<>() ;
        List<Integer> ciftSayilar = new ArrayList<>() ;
        List<Integer> sayilar1 = new ArrayList<>() ;
        List<Integer> sayilar2  = new ArrayList<>();
        List<Integer> sayilar3 = new ArrayList<>() ;
        List<Integer> sayilar4 = new ArrayList<>() ;

        Context context1 = new Context("c1",1,sayilar,tekSayilar,ciftSayilar,sayilar1,sayilar2,sayilar3,sayilar4);
        Context context2 = new Context("c2",2,sayilar,tekSayilar,ciftSayilar,sayilar1,sayilar2,sayilar3,sayilar4);
        Context context3 = new Context("c3",3,sayilar,tekSayilar,ciftSayilar,sayilar1,sayilar2,sayilar3,sayilar4);
        Context context4 = new Context("c4",4,sayilar,tekSayilar,ciftSayilar,sayilar1,sayilar2,sayilar3,sayilar4);

        Thread t1 = new Thread(context1);
        t1.start();
        Thread t2 = new Thread(context2);
        t2.start();
        Thread t3 = new Thread(context3);
        t3.start();
        Thread t4 = new Thread(context4);
        t4.start();


        Context contextTek = new Context("tek",5,sayilar,tekSayilar,ciftSayilar,sayilar1,sayilar2,sayilar3,sayilar4);
        Thread t5 = new Thread(contextTek);
        t5.start();
        Context contextCift = new Context("cift",6,sayilar,tekSayilar,ciftSayilar,sayilar1,sayilar2,sayilar3,sayilar4);
        Thread t6 = new Thread(contextCift);
        t6.start();

        Thread.sleep(3000);
        show(tekSayilar,ciftSayilar);

    }

    public static void show(List<Integer> sayiTek, List<Integer> sayiCift){
        System.out.println("tek sayilar : " + sayiTek.stream().sorted().toList());
        Collections.sort(sayiCift,Collections.reverseOrder());

        System.out.println("cift sayilar : " + sayiCift);
    }
}
