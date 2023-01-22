package deneme1;

public class Player {
    private String name;
    private int id;
    public static int count0 = 13;
    public static int count1 = 0;
    public static int count2 = 0;
    //statik nesne örneği alınmadan oluşturulur. Sınıf değişkenleridir
    //nesne olmadan da vardırlar.

    Player(String name, int id){
        this.name = name;
        this.id =id;
        count1 ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void login(){
        count2 ++;
    }

    public void showName(String name){

        System.out.println(name);
    }

}
