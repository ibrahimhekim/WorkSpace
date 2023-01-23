import java.util.Scanner;

public class hesapMakinesi {
    static double topla(double a, double b){
        double result = a+b;
        System.out.println("işlemin sonucu : "+a+"+"+b+"=" + result);
        return result;
    }
    static double cikar(double a, double b){
        double result = a-b;
        System.out.println("işlemin sonucu : "+a+"-"+b+"=" + result);
        return result;
    }
    static double carp(double a, double b){
        double result = a*b;
        System.out.println("işlemin sonucu : "+a+"*"+b+"=" + result);
        return result;
    }
    static double bol(double a, double b){
        double result = a/b;
        System.out.println("işlemin sonucu : "+a+"/"+b+"=" + result);
        return result;
    }
    static double us(double a, double b){
        double result = Math.pow(a,b);
        System.out.println("işlemin sonucu : "+a+"^"+b+"=" + result);
        return result;
    }
    static double mod(double a, double b){
        double result = a%b;
        System.out.println("işlemin sonucu : "+a+"%"+b+"=" + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean sayac=true;
        while (sayac){

            System.out.println("bir sayi giriniz : ");
            double a = input.nextDouble();
            System.out.println("yapmak istediğiniz işlemi girin : (+,-,*,/,^,%)");
            String islem = input.next();
            System.out.println("diğer sayiyi girin : ");
            double b = input.nextDouble();

            switch (islem) {
                case "+":
                    topla(a, b);
                    break;
                case "-":
                    cikar(a, b);
                    break;
                case "*":
                    carp(a, b);
                    break;
                case "/":
                    bol(a, b);
                    break;
                case "^":
                    us(a, b);
                    break;
                case "%":
                    mod(a, b);
                    break;
                default:
                    System.out.println("yanlis islem girdiniz..");
            }
            System.out.println("devam etmek istiyor musunuz : (e/h)");
            String devam = input.next();
            if (devam.equals("e")){
                sayac = true;
            }else sayac = false;
        }
    }
}
