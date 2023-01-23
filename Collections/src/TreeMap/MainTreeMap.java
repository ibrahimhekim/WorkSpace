package TreeMap;

import TreeSet.Student;

import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>(new OrderByNoComparator()); //alfabetik geldi.
        students.put(102, new Student("ibrahim", 43));
        students.put(101, new Student("bekir", 75));
        students.put(103, new Student("mustafa", 98));

        for (Student stu : students.values()) {
            System.out.println(stu.getName());
        }
    }
}
