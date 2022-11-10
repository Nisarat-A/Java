package Main;
import int101.dummy.*;
public class int101h12 {
    public static void main(String[] args) {
        final int loop =  1_000_000;
        final int index =  10;

        // int count[]; //collect integers
        //=new int [10];
        var count = new int[10];
        for(int i = 0 ; i<loop ; i++){
           /* int count0=0;
            int count1=0;
            int count2=0;
            int count3=0;
            int count4=0;
            int count5=0;
            int count6=0;
            int count7=0;
            int count8=0;
            int count9=0;
            int count10=0;*/
            int d = dummy.rand2();
            count[d]++;} for(int i=0 ;i<index;i++){
            System.out.printf("%d: %d%n",i,count[i]);
        }
         /*  if (d==0){ count0++;}
            if (d==1){ count1++;}
            if (d==2){ count2++;}
            if (d==3){ count3++;}
            if (d==4){ count4++;}
            if (d==5){ count5++;}
            if (d==6){ count6++;}
            if (d==7){ count7++;}
            if (d==8){ count8++;}
            if (d==9){ count9++;}
            if (d==10){ count10++;}*/
 /*           System.out.println(count0);
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count3);
            System.out.println(count4);
            System.out.println(count5);
            System.out.println(count6);
            System.out.println(count7);
            System.out.println(count8);
            System.out.println(count9);
            System.out.println(count10);*/

        }

    }

