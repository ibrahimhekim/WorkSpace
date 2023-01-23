public class Teacher {

    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("ad \t:"+this.name);
        System.out.println("no \t:"+this.mpno);
        System.out.println("brans \t:"+this.branch);
    }
}
