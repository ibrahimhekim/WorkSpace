import java.util.Scanner;

public class isPalindromRecursive {
    static boolean palindrom(int number){

        int sonBasamak, newNumber=0, x=10;
        int deneme = number;

        while (number !=0) {
            sonBasamak = number % 10;
            newNumber =(newNumber*x)+sonBasamak;
            number/=10;
        }
        System.out.println("girdiginiz sayi : "+deneme);
        System.out.println("sayinin tersi   : "+newNumber);

        if (deneme == newNumber)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int number = input.nextInt();
        if (palindrom(number)){
            System.out.println("girdiğiniz sayi palindromdur..");
        }else{
            System.out.println("sayi palindrom degildir..");
        }
    }
}
