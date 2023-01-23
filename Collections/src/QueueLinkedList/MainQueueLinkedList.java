package QueueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueueLinkedList {
    public static void main(String[] args) {        //FIFO ve LIFO yapisinda listeleme yapilir
        Queue<String> q = new LinkedList<>();

        q.add("ibrahim");
        q.add("hekim");
        q.add("32");
        q.add("topkapi");

        System.out.println("listenin ilk elemani : "+q.element());
        System.out.println("listenin ilk elemani : "+q.peek());
        System.out.println("---------------");
        System.out.println("listenin ilk hali : ");
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------------");
        System.out.println("listeden cekilen eleman (FIFO) : " + q.poll());

        System.out.println("yeni liste : ");
        Iterator<String> itr2 = q.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
