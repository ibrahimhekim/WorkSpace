import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //List<User> users = new ArrayList<>();
        //users.add(new User(0,"Ibrahim"));
        //users.stream() olarak da çalıştırılabilirdi. ama isimiz show sjsj
        User.userEkleme(1,"Ahmet");
        User.userEkleme(2,"Mustafa");
        User.userEkleme(3,"Selim");
        User.userEkleme(4,"Zeynep");
        User.userEkleme(5,"Mehmet");
        User.userEkleme(6,"Bekir");
        User.userEkleme(7,"Onur");

        //User.users.stream().forEach(user -> System.out.println(user.toString()));

        /*User.users.stream().forEach(user -> {
            System.out.println("Java 8 ile gelen yenilikler");
            System.out.println(user.toString());
        });*/

        //User.users.stream().forEach(user -> user.talk());
        //User.users.stream().forEach(User ::talk); //aynisi (meethod referance)

        //User.users.stream().filter(user -> user.getId()>5); //id 5 ten büyükleri getirir
        //long adet = User.users.stream().filter(user -> user.getId()>5).count(); //adedi verir

        List<User> filteredList = User.users.stream().filter(user -> user.getId()>5).collect(Collectors.toList());
        filteredList.stream().forEach(User::talk); //5 ten buyukleri filtreledik. ekrana bastırdık.

        /*List<User> mappedList = User.users.stream() //listede degisiklik yapmaya olanak saglar.
                .map(user -> new User(user.getId()+100, user.getName())).collect(Collectors.toList());*/

        Map<Integer, String> newUserMap =  User.users.stream()
                .collect(Collectors.toMap(user -> user.getId(), user -> user.getName())); //tip donusturme

        newUserMap.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}
