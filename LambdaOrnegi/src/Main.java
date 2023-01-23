public class Main {

    public static void main(String[] args) {
	Matematik toplama = ((a, b) -> a+b);
    Matematik cikarma = ((a, b) -> a-b);
    Matematik carpma = ((a, b) -> a*b);
    Matematik bolme = ((a, b) ->{
        if (b==0){
            b=1;
        }
        return a/b;
    });

        System.out.println(toplama.transaction(10,2));
        System.out.println(cikarma.transaction(75,1));
        System.out.println(carpma.transaction(7,8));
        System.out.println(bolme.transaction(12,3));
    }
}
