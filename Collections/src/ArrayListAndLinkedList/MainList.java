package ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
            //VECTOR : artik kullanilmayan list cesidi. Cunku yavas. ArrayList ile ayni sekilde kullaniliyor
public class MainList {
    public static void main(String[] args) {
        ArrayList country = new ArrayList();

        country.add("istanbul");country.add("hakkari");country.add("mus");
        country.add("giresun");country.add("manisa");country.add("hatay");
        System.out.println("listenin ilk hali : " + country);

        country.add(1,"mugla");
        System.out.println("listeye mugla eklendi : " + country);

        country.set(5,"gumushane");
        System.out.println("listeden manisa silinip gumushane eklendi : " + country);

        String a = (String) country.remove(3);
        System.out.println("listeden 3. indis "+ a +" silindi : " + country);

        System.out.println("sehir sayisi : "+country.size());

        Iterator itr = country.iterator();
        int sayac = 1;
        while (itr.hasNext()){ //bir sonraki var mı
            System.out.print(sayac + ". ");
            System.out.println(itr.next());
            sayac++;
        }

        System.out.println("giresun sehrinin sırası : " + (country.indexOf("giresun")+1));
        System.out.println("hakkari sehri listede var mi? : "+country.contains("hakkari"));

        //country.forEach(i-> System.out.println(i));

        List<String> country2 = new ArrayList<>();
        country2.add("izmir");
        country2.add("edirne");
        country2.addAll(country);
        System.out.println("yeni sehir listesi : "+country2);

        List<String> country3 = country2.subList(2,6);
        System.out.println("yeni sehir listesi : "+country3);


        //LINKEDLIST KULLANIMI
        List<String> sehirler = new LinkedList<>();     //kullanim ayni. sistem farkli
        sehirler.addAll(country3);
        System.out.println("yeni sehir listesi : "+sehirler);

        sehirler.remove("hakkari");
        sehirler.remove(0);         //iki farkli kullanimi
        System.out.println("sehirler listesi : "+sehirler);
    }
}
