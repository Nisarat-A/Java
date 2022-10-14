public class PositiveNegativeZero {
    public static void main(String[] args) {
            CheckNumber(0);
    }

    public static void CheckNumber(int number){
        if(number<0){
            System.out.println("negative");
        } else if (number==0) {
            System.out.println("Zero");
        }else {
        System.out.println("Positive");
    }
    }
}