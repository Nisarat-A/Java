package com.nisar;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        int count = 0, sum = 0;
        while(count<10){
            int order = count+1;
            System.out.println("Enter number #"+ order+":");
            boolean isAnInt =scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count++;
                sum+=number;
            /*    if(count==10){
                    break;*/
                //}
            }else{
                System.out.println("invalid number");
            }
            scanner.nextLine(); //handle end of line
            }
        System.out.println("sum equal " + sum   );
        scanner.close();
        }


    }


