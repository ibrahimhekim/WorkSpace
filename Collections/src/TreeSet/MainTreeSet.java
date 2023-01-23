package TreeSet;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainTreeSet {
    public static void main(String[] args) {    //bir ozelligine gore siralama yapariz
        //TreeSet<Student> students= new TreeSet<>(new OrderNameComparator());
        TreeSet<Student> students= new TreeSet<>(new OrderNoteComparator().reversed()); //reversed ile tersini sirala
        students.add(new Student("ibrahim",25));
        students.add(new Student("bekir", 95));
        students.add(new Student("talip", 95));
        students.add(new Student("bekir", 40));
        students.add(new Student("zeynep", 75));
        students.add(new Student("mustafa", 95));
        students.add(new Student("bekir", 95));


        //System.out.println("isme gore siralama");
        //students.stream().forEach(i -> System.out.println(i.getName()));
        System.out.println("nota gore siralama"); //talipi listeden cikardi
        students.stream().forEach(k -> System.out.println(k.getName()));

    }
}
