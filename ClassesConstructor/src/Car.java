public class Car {

    String type;
    String model;
    String color;
    int speed=110;
    int speedLimit=190;

    Car(String type, String model, String color){
        this.type=type;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.speedLimit = speedLimit;
    }

    Car(String model){
        this.model = model;
    }

    Car(){
        System.out.println("constructor olusturuldu..");
    }

    void increaseSpeed(int increment){
        this.speed-=increment;
    }

    void decreaseSpeed(int decrease){
        this.speed+= decrease;
    }
}
