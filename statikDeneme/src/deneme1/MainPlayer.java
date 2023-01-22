package deneme1;

import deneme1.Player;

public class MainPlayer {
//static bir metodun içerisine static bir metot çağrılabilir. aksi halde örneğini almak gerekir.
    public  static void  print(){
        System.out.println("uyari mesaji");
    }

    public static void main(String[] args) {

        print();//nesne örneği almadan çağrabildik. nesne değil, class a ait.(static)

        System.out.println(Player.count0); //static count field ı yani class a aitler
        System.out.println(Player.count1); //count1 = 0
        System.out.println(Player.count2+"-");


	Player p1 = new Player("ibrahim",123);
        System.out.println(Player.count1); //count1 = 1

        p1.login();
        System.out.println(Player.count2+"-");

    Player p2 = new Player("mustafa",456);
    System.out.println(Player.count1); //count1 = 2

        p2.login();
        System.out.println(Player.count2+"-");

        p2.login();
        System.out.println(Player.count2+"-");


        p1.showName(p1.getName());
        p2.showName(p2.getName());
        p1.showName(p2.getName());
    }
}
