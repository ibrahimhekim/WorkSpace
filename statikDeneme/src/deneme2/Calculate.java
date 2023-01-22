package deneme2;

public class Calculate {

    public static void calcAverage1(int[] notes){
        int total = 0;

        for (int i : notes){
            total += i;
        }

        int average = total/notes.length;
        System.out.println("ortalamaniz : "+average);
    }
    
    public static void calcAverage2(Course[] dersler){
        int total = 0;

        for (Course c : dersler) {
            total += c.note;
        }

        int average = total/dersler.length;
        System.out.println("ortalamaniz : "+average);
    }
}
