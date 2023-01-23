import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    public static List<User> users = new ArrayList<>();
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void userEkleme(int id, String name){

        users.add(new User(id,name));
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public  void talk(){
        System.out.println("Hi, I am " + this.name);
    }
}
