import java.util.Scanner;

public class overloading {
    static void print(){
        System.out.println("ekran yazisi");
    }
    static void print(int a){
        System.out.println("1. girilen 'int' sayi : "+a);
    }
    static void print(double b){
        System.out.println("2. girilen 'double' sayi double : "+b);
    }
    static void print(float c){
        System.out.println("3. girilen 'float' sayi : "+c);
    }
    static void print(int a,double b){
        System.out.println("ilk iki sayinin toplami : "+(a+b));
    }
    static void print(int a, double b,float c){
        System.out.println("tüm sayilarin toplamı : "+(int)(a+b+c));
        System.out.println("tüm sayilarin çarpimi : "+(int)(a*b*c));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a 'int' sayisini gir : ");
        int a = scanner.nextInt();
        System.out.println("b 'double' sayisini gir : ");
        double b = scanner.nextInt();
        System.out.println("c 'float' sayisini gir : ");
        float c = scanner.nextInt();
        print();
        print(a);
        print(b);
        print(c);
        print(a,b);
        print(a,b,c);
    }
}
