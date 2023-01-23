import java.util.Scanner;

public class recursiveUs {

    static double usAlma(double a, double b){
        double result = 1;
        if(b==0){
            return result;
        }else{
            result = a*usAlma(a,(b-1));

        return result;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int yanit;
        do {
            System.out.println("tabani girin : ");
            double taban = input.nextDouble();
            System.out.println("ussu girin : ");
            double us = input.nextDouble();
            System.out.println(usAlma(taban,us));
            System.out.println("devam etmek istiyor musunuz?(e=1/h=2) : ");
            yanit = input.nextInt();

        }while (yanit == 1);
    }
}
