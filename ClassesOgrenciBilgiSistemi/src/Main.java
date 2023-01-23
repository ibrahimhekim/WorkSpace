import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Teacher teacher1 = new Teacher("Onur Dogan","1111111","KMY");
        Teacher teacher2 = new Teacher("Ibrahim Hekim","2222222","FZK");
        Teacher teacher3 = new Teacher("Bekir kumas", "3333333","BIO");


        Courses kimya = new Courses("Kimya","101","KMY");
        kimya.addTeacher(teacher1);
        Courses fizik = new Courses("Fizik","102","FZK");
        fizik.addTeacher(teacher2);
        Courses biyoloji = new Courses("Biyoloji","103","BIO");
        biyoloji.addTeacher(teacher3);




        Student s1 = new Student("yastik","123","4",kimya,fizik,biyoloji);
        s1.addBulkExamNote(70,45,25);
        s1.isPass();

        Student s2 = new Student("yorgan","456","4",kimya,fizik,biyoloji);
        s2.addBulkExamNote(20,45,95);
        s2.isPass();

        Student s3 = new Student("sise","789","4",kimya,fizik,biyoloji);
        s3.addBulkExamNote(70,85,35);
        s3.isPass();


    }
}
