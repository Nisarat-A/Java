package com.nisar;
public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("sum digit ="+sumDigits(125));
        System.out.println("sum digit ="+sumDigits(-125));
        System.out.println("sum digit ="+sumDigits(5));
        System.out.println("sum digit ="+sumDigits(1805616));

    }
    public static int sumDigits(int number){
        if ( number<10){
            return -1;
        }
        int sum =0;
        // 125 = 125/10 = 120*10=120 125-120=5;

        while(number>0){
            //extract least digit
            int digit = number%10;
            sum +=digit;
            //drop least significant digit
            number /=10; //number =number/10
        }
        return sum;
    }
}
