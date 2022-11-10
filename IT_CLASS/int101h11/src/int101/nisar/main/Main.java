package int101.nisar.main;

import int101.nisar.puzzling.*;

public class Main {
    public static void main(String[] args) {
        testPuzzle();
    }
    public static void testPuzzle(){
        puzzle p =new puzzle();
        puzzle q =new puzzle();
        System.out.println("p= "+p.getValue());
        System.out.println("p= "+p.getValue());

        System.out.println("q= "+q.getValue());
        System.out.println("q= "+q.getValue());
    }
    private static void testAverage(int count){
        //random count times and avg values
    }
    public static void testRander(){
        int round = 10_000;
        double sum=0;
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        rendor r = new rendor(10,15);
        for (int i =0; i<round; i++){
            int v= r.getValue();
            min = v<min?v :min;
            max = v>max?v :max;
            sum +=v;
        }
        System.out.println("MIN = " +min +" Max = "+max+"average = " + sum/round);
    }
}