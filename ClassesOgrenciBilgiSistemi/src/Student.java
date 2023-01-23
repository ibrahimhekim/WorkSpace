public class Student {
    String name;
    String stuNo;
    String classes;
    Courses c1;
    Courses c2;
    Courses c3;
    double average;
    boolean isPass; //öyle mi değil mi anlamına gelir başında is varsa.

    Student(String name, String stuNo, String classes, Courses c1, Courses c2, Courses c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void  addBulkExamNote(int note1, int note2, int note3){

        if (note1>=0 && note1<=100){
            c1.note = note1;
        }
        if (note2>=0 && note2<=100){
            c2.note = note2;
        }
        if (note3>=0 && note3<=100){
            c3.note = note3;
        }
    }
    void isPass() {
        System.out.println("===================================");
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("başarılı bir şekilde geçtiniz.");
            this.isPass = true;
        }
        else{
            System.out.println("kaldiniz");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){

        System.out.println(this.c1.name+" notu : "+c1.note);
        System.out.println(c2.name+" notu : "+c2.note);
        System.out.println(c3.name+" notu : "+c3.note);
        System.out.println("ortalama : "+this.average);

    }



}
