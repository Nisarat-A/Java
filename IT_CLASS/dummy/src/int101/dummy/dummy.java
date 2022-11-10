package int101.dummy;

import java.util.Random;

public class dummy {
    public static int rand(){return (int)(Math.random() *10);}
    public static int rand2(){return (new Random()).nextInt(10);}
    public int rand3(){return 0;}

}
