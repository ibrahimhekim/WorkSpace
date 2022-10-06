package odev;

import java.util.ArrayList;
import java.util.List;

public class Context implements Runnable {

    private String name;
    private int id;

    List<Integer> sayilar;
    List<Integer> tekSayilar ;
    List<Integer> ciftSayilar ;
    List<Integer> sayilar1 ;
    List<Integer> sayilar2 ;
    List<Integer> sayilar3 ;
    List<Integer> sayilar4 ;


    public Context(String name, int id, List<Integer> sayilar, List<Integer> tekSayilar, List<Integer> ciftSayilar, List<Integer> sayilar1, List<Integer> sayilar2, List<Integer> sayilar3, List<Integer> sayilar4) {
        this.name = name;
        this.id = id;
        this.sayilar = sayilar;
        this.tekSayilar = tekSayilar;
        this.ciftSayilar = ciftSayilar;
        this.sayilar1 = sayilar1;
        this.sayilar2 = sayilar2;
        this.sayilar3 = sayilar3;
        this.sayilar4 = sayilar4;
    }



    @Override
    public void run() {


        for (int i = 0; i < 102; i++) {
            sayilar.add(i);
        }

        if (this.id == 1) {
            System.out.println(this.name + " calisti.");
            for (int i = 1; i < 26; i++) {

                sayilar1.add(sayilar.get(i));
                //System.out.println(this.getName() + " : " + sayilar.get(i));
                if (sayilar.get(i)%2==0){
                    ciftSayilar.add(i);
                }else {
                    tekSayilar.add(i);
                }
            }
        }

        if (this.id == 2) {
            System.out.println(this.name + " calisti.");
            for (int i = 26; i < 51; i++) {

                sayilar2.add(sayilar.get(i));
                //System.out.println(this.getName() + " : " + sayilar.get(i));
                if (sayilar.get(i)%2==0){
                    ciftSayilar.add(i);
                }else {
                    tekSayilar.add(i);
                }
            }
        }

        if (this.id == 3) {
            System.out.println(this.name + " calisti.");
            for (int i = 51; i < 76; i++) {

                sayilar3.add(sayilar.get(i));
                //System.out.println(this.getName() + " : " + sayilar.get(i));
                if (sayilar.get(i)%2==0){
                    ciftSayilar.add(i);
                }else {
                    tekSayilar.add(i);
                }
            }
        }

        if (this.id == 4) {
            System.out.println(this.name + " calisti.");
            for (int i = 76; i < 101; i++) {

                sayilar4.add(sayilar.get(i));
                //System.out.println(this.getName() + " : " + sayilar.get(i));
                if (sayilar.get(i)%2==0){
                    ciftSayilar.add(i);
                }else {
                    tekSayilar.add(i);
                }
            }
        }

        if (this.id == 5) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + " calisti.");
                System.out.println(this.getName() + " : " + tekSayilar.toString());
        }
        if (this.id == 6) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + " calisti.");
                System.out.println(this.getName() + " : " + ciftSayilar.toString());
        }

        //this.show(tekSayilar,ciftSayilar); 6 kez calistirdi.
    }

    public void show(List<Integer> sayiTek, List<Integer> sayiCift){
        System.out.println("tek sayilar : " + sayiTek.stream().sorted().toList());
        System.out.println("cift sayilar : " + sayiCift.stream().sorted().toList());
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
