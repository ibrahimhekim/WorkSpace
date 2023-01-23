import java.util.Scanner;

public class recursiveMetot {

    static int sum(int n){
        System.out.println("eklenecek sayi : "+n);
        if (n==1){
            System.out.println("ara toplam : "+1);
            return 1;
        }
        int toplam = sum(n-1) + n;
        System.out.println("ara toplam : "+toplam);
        return toplam;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sayi gir : ");
        int n= input.nextInt();
        System.out.println("asıl toplam : "+sum(n));

    }
}
