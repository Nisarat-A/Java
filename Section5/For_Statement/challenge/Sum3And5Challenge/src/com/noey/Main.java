package com.noey;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int count =0 ;
        int sum =0;
        for(int number=1;number<1001;number++){

            if ((number%3==0)&&(number%5==0)){
                count++;
                sum+=number;
                System.out.println("found number "+ number);

            }
            if (count==5){
                break;
            }
        }
        System.out.println("sum = "+sum);
    }
}