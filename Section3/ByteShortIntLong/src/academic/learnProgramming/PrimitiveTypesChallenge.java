package academic.learnProgramming;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByte = Byte.MAX_VALUE;
        short myShort = Short.MIN_VALUE;
        int myInt = Integer.MIN_VALUE;
        long myLong = 50_000L*10L*(myInt+myByte+myShort);
        System.out.println("Total ="+ (myLong));


            short shortTotal =(short) (1000*10 *
                    (myByte+myInt+myInt));
    }


}
