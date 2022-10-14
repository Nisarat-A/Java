package academic.learnProgramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimun value = "+myMinIntValue);
        System.out.println("Integer Maximun value = "+myMaxIntValue);
        System.out.println("Busted Maximun value = "+(myMaxIntValue+1)); //error overflow back to minimum
        System.out.println("Busted Minimun value = "+(myMinIntValue-1)); //error underflow back to maximum
        int myMaximumTest =  2_147_483_647;


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value is " + myMinByteValue);
        System.out.println("Byte Maximum Value is " + myMaxByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value is " + myMinshortValue);

        long myLongValue = 100L; //worddeco tell java it's long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value is " + myMinLongValue);
        System.out.println("Long Maximum Value is " + myMaxLongValue);


        //literalValue
        long BigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(BigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue =(byte) (myMinByteValue/2); //convert type
        short myNewshortValue =(short) (myMinshortValue/2); //convert type

        //byte 8 bits
        //short 16 bits
        //int 32 bits
        //long 64 bits


    }
}
