public class NumberToWords {
    public static void   numberToWords(int number){
        if (number<0){System.out.print("Invalid Value");}
            int count =getDigitCount(number);
            number = reverse(number);
            for (int i=0;i<count;i++){
                int digit = number%10;
                switch (digit){
                    case 1 :
                        System.out.print("One"); break;
                    case 2 :
                        System.out.print("Two"); break;
                    case 3 :
                        System.out.println("Three"); break;
                    case 4 :
                        System.out.print("Four"); break;
                    case 5 :
                        System.out.print("Five"); break;
                    case 6 :
                        System.out.println("Six"); break;
                    case 7 :
                        System.out.println("Seven"); break;
                    case 8:
                        System.out.println("Eight"); break;
                    case 9:
                        System.out.println("Nine");break;
                    case 0:
                        System.out.println("Zero");break;
                }
                number/=10;

            }

    }

    public static int reverse(int number){
        int reverse= 0;
        while (number!=0){
            reverse = reverse*10 + number%10;
            number /=10;
        } return reverse;
    }

    public static int getDigitCount(int number){
    return  (number<0)? -1: Integer.toString(number).length();
    }

}
