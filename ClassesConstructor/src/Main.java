import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Alltaki bilgileri lütfen girin : ");
        System.out.println("arabanin tipi : ");
        String type = input.next();
        System.out.println("arabanin modeli :");
        String model = input.next();
        System.out.println("arabanin rengi :");
        String color = input.next();

        Car car1 = new Car(type,model,color);
        Car car2 = new Car(model);       //constructor overloading

        System.out.println("hizi ne kadar arttı : ");
        int decrease = input.nextInt();
        car1.decreaseSpeed(decrease);
        System.out.println( car1.model+" model arabanin yeni hizi : "+car1.speed);

        System.out.println("tip \t: "+car1.type);
        System.out.println("max hiz \t: "+car1.speedLimit);

    }
}
