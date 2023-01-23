import java.util.Scanner;

public class recursiveAsal {

    static void Asal(double sayi, double donen){


        if(sayi%donen==0){
            System.out.println("değildir");
            return;
        }
        else if (sayi==donen){

            System.out.println("asaldir");
            return;
        }

        Asal(sayi,donen+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayi girin : ");
        double sayi = input.nextDouble();

        Asal(sayi,2);
    }
}
