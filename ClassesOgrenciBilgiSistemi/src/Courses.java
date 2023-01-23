public class Courses {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Courses(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }else System.out.println("eslesme yapılamadi..");
    }

    void printTeacher(){
        this.teacher.print();
    }
}
