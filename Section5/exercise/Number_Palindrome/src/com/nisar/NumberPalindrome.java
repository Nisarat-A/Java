package com.nisar;
public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse =0;
        int check = number;
        while(check!=0){
            int lastDigit = check % 10;
            reverse = (reverse*10) + lastDigit;
            check /=10;
        }
        if (number==reverse){
            return true;
        }return  false;
    }
}
