package com.nisar;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*System.out.println("10,000 at 2% interest" + calculateInterest(10_000.00,2.0));
        System.out.println("10,000 at 3% interest" + calculateInterest(10_000.00,3.0));
        System.out.println("10,000 at 4% interest" + calculateInterest(10_000.00,4.0));
        System.out.println("10,000 at 5% interest" + calculateInterest(10_000.00,5.0));*/
        //very tedious

        //for(init;termination;incremental)
        for (int i=0;i<5;i++){
            System.out.println("Loop"+i+"Hello");

            /*using the for statement call calculateInterest method with
            the amount 10000 with interestRate of 2 3 5 6 7 8
            print result to console*/
        }
        for (int i=2;i<9;i++){
            System.out.println("10,000 at "+i+" % interest ="+ String.format("%.2f ", calculateInterest(10000.00,(double)i))  );
            // 2 decimal digit
        }
        //modify to 8 -> 2 %
        System.out.println("**********************");
        for (int i=8;i>1;i--){
            System.out.println("10,000 at "+i+" % interest ="+ String.format("%.2f ", calculateInterest(10000.00,(double)i))  );
            // 2 decimal digit
        }
        // create for statement using any range of numbers
        //Determine if the number is a prime number using the isPrime method
        //if it is a prime number, AND increment a count of the
        // number of prime number found
        //if that count is 3 exit the for loop
        //hint: Use the break; statement to exist

        System.out.println("**********************");
        int count =0;
        for (int i=1;i<1000;i++){
            if (isPrime(i)){
                count ++;
                System.out.println(i+" is prime number");
                if (count==100){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        } // break code move here

    }
    public static double calculateInterest(double amount,double interest){
        return (amount*(interest/100.0));
    }



    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }/*for (int i=2;i<=n/2;i++){*/
        for (int i=2;i<=(long )Math.sqrt(n);i++){
            System.out.println("looping "+i);
            if (n%i==0){
                return false;
            }
        }return true;
    }
}