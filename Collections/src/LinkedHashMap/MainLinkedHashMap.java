package LinkedHashMap;

import TreeSet.Student;

import java.util.LinkedHashMap;

public class MainLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();
        students.put(102, new Student("ibrahim", 43));
        students.put(101, new Student("bekir", 75));
        students.put(103, new Student("mustafa", 98));

        for (Student stu : students.values()) {
            System.out.println(stu.getName());
        }
    }
}
