package PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MainPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });     //compare sayesinde FIFO mantıgından cikip kendi siralama yontemine gecirebiliyoruz.

        pq.add("bekir");
        pq.add("suleyman");
        pq.add("mustafa");
        pq.add("mehmet");

        Iterator<String> itr = pq.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
