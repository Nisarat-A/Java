package com.nisar;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(1000);
    }
    public static void printFactors(int number) {
        int i = 1;
       if (number<1){
           System.out.print("Invalid Value");
       }else while (i<=number){
           if ((number%i) == 0){
           System.out.println(i);
          }
           i++;
       }
    }
}
