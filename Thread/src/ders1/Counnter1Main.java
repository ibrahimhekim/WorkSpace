package ders1;

import org.w3c.dom.css.Counter;

public class Counnter1Main {

    public static void main(String[] args) {
	Counter1 c1 = new Counter1();
    c1.start();//karisik gelir. run sirayla calistirir

    Counter1 c2 = new Counter1();
    c2.start();

    c1.run();
    c2.run();   //sirayla gelir



    }
}
