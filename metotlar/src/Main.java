import java.util.Scanner;

public class Main {

    static int power(int base, int exp){
        int sonuc=1;
        for (int i=0;i<exp;i++){
            sonuc *=base;
        }

        return sonuc;
    }

    static String mesaj(int sonuc){
        System.out.println("işlemin sonucu : " + sonuc);
        return null;
    }

    static void mesaj2(int sonuc){
        int karesi = sonuc*sonuc;
        System.out.println("işlemin karesi : " + karesi);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tabanı gir : ");
        int base = scanner.nextInt();

        System.out.println("üssü gir : ");
        int exp = scanner.nextInt();

        int sonuc = power(base,exp);
        mesaj(sonuc);
        mesaj2(sonuc);
    }
}
