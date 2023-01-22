package deneme2;

public class MainCourse {

    public static void main(String[] args) {

        Course matematik = new Course("Matematik","MAT",70);
        Course fizik = new Course("Fizik","FZK",50);
        Course kimya = new Course("Kimya", "KMY",30);

        int[] notlar = {matematik.note,fizik.note,kimya.note};
        Calculate.calcAverage1(notlar);
                                                            //2 şekilde de veri alınır.
        Course[] dersler = {matematik,fizik,kimya};
        Calculate.calcAverage2(dersler);


    }
}
