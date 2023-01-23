package LinkedHashSet;

import java.util.LinkedHashSet;

public class MainLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(123);     //sirayla verir hash ten farkı bu.
        linkedHashSet.add(324);
        linkedHashSet.add(46);
        linkedHashSet.add(null);
        linkedHashSet.add(123);
        linkedHashSet.add(247);

        linkedHashSet.stream().forEach(integer -> System.out.println(integer));


    }
}
