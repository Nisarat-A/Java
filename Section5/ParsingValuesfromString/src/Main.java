public class Main {
    public static void main(String[] args) {
       /* String numberAsString = "2018";
        System.out.println("number as string = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println(number);
        numberAsString += 1;
        number ++;
        System.out.println("numberAsString" + numberAsString);
        System.out.println( number);*/



        String numberAsString = "2018.125";
        System.out.println("number as string = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println(number);
        numberAsString += 1;
        number ++;
        System.out.println("numberAsString" + numberAsString);
        System.out.println( number);
    }
}