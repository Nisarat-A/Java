public class Main {
    public static void main(String[] args) {
        //Unit 1 Pound = 0.45359237 kg
       double UnitPoundToKilogram = 0.45359237;
        //declare var double to store value
        double Pound= 528.6513;
        double Kilogram = Pound*UnitPoundToKilogram;
        System.out.println("Pound to Kilo ="+ Kilogram );
        // correct btw the ans of instructors much better

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds*0.45359237;
        System.out.println("converted kg : "+ convertedKilograms);

        double pi =3.145927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}