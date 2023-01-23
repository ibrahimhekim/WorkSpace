package JAVA;

public class Lambdas {
    public static void main(String[] args) {
        /*Cat myCat = new Cat();
        myCat.print();
        printThing(myCat);*/
        //printThing(() -> System.out.println("miyav"));
        printThing((prefix, suffix) -> System.out.println(prefix + "'miyav'" + suffix));
//farkındaysak artık Cat class ı ile bisey yapmıyoruz
    }
    static void printThing(Printable thing){
        thing.print("Cat says: ","!");
    }
}
