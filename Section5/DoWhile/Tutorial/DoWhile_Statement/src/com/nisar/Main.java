package com.nisar;
public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        for (int i=1 ; i <6 ; i++){
            System.out.println("value is "+ i);
            i++;
        }

        int count =1;
        //using when you dnt know the end

        while (count!=6){
            System.out.println("count value is "+ count);
            count++;
        }

        //in another fashion
        count=1;
        while (true){
            if (count==5){
                break;
            }
            System.out.println("count value is "+ count);
            count++;
        }*/
        //it's not execute code block itself so it's ways to check if code dont execute

/*       count =6;
        while (count!=6){
            System.out.println("count value is "+ count);
            count++;
        }
        for (int i=6 ; i <6 ; i++){
            System.out.println("value is "+ i);
            i++;
        }*/

        //Do while
       /* count   =1;
        do{
            System.out.println("Count value was" + count);
            count++;
        }while (count!=6);
        count   =6;
        do{
            System.out.println("Count value was" + count);
            count++;
            if(count>100){
                break;
            }
        }while (count!=6);

        int number =4;
        int finishedNumber =20;

        while(number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

        }}*/

        //create a method called isEvenNumber that takes a parameter of type int
        //Its purpose is to determine if the argument passed to the method is
        // an even number or not
        //return true if an even number,otherwise return false
        int count = 0;
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
            count++;
            if (count>=5){
                break;
            }
        }
        System.out.println("Total even number found =" + count);

    }
    //MAke it also record the total of even number it has found
    //and break once are 5 found
    //and at the end,display the total number of even number found


        public static boolean isEvenNumber ( int number){
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }


    }