package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MainHashSet {

    public static void main(String[] args) {        //ayni elemani bir kez yazar. indis yok. sıralama yok. kume mantıgı
        HashSet<Integer> hSet = new HashSet<>();       //girenin sirasi cikanin sirasi belli degil. linked ile hallolur
        hSet.add(10); hSet.add(20);
        hSet.add(10); hSet.add(30); hSet.add(null);

        hSet.isEmpty();
        hSet.contains(20);
        hSet.size();
        int sayac = 1;
        for (Integer sayi: hSet) {System.out.println(sayac + ". deger : " + sayi); sayac ++;}
        hSet.remove(10);
        int sayac2 = 1;
        for (Integer sayi: hSet) {System.out.println(sayac2 + ". deger : " + sayi); sayac2 ++;}     //1.yontem
        //hSet.clear(); //hepsini siler

        for (Integer integer : hSet) {                              //2. yontem
            System.out.println(integer);
        }

        Iterator<Integer> itr = hSet.iterator();                        //3. yontem
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        hSet.stream().forEach(integer -> System.out.println(integer));             //4. yontem
    }
}
