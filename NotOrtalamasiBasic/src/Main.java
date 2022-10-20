import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik ders notunu girin : ");
        int mat = input.nextInt();
        System.out.println("Fizik ders notunu girin : ");
        int fzk = input.nextInt();
        System.out.println("Kimya ders notunu girin : ");
        int kmy = input.nextInt();
        System.out.println("Turkce ders notunu girin : ");
        int trk = input.nextInt();
        System.out.println("Tarih ders notunu girin : ");
        int trh = input.nextInt();
        System.out.println("Muzik ders notunu girin : ");
        int mzk = input.nextInt();

        double ort = (mat + fzk + kmy + trk + trh + mzk)/6;

        System.out.println("ders ortalamasi : " + ort);
        int gecerNot = 60;
        String durum=(ort>=gecerNot)? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.print(durum);

    }
}
