package com.nisar;
public class Main {
    private static final String INVALID_VALUE_MASSAGE="Invalid value";
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getDurationString(1800,50));
        System.out.println(getDurationString(36000));


    }
    public static  String getDurationString(int minutes,int seconds){
    //minute >=0 && second >=0 <=59
        //show how many hour minute and second
        if ((minutes >=0 )&& (seconds >=0 || seconds<=59  )){

            int hour = minutes/60;
            minutes = minutes%60;
            String hourString = hour + "h";
            if(hour <10){
                hourString = "0"+hourString;
            }
            String minuteString = minutes + "m";

            if(minutes <10){
                minuteString = "0"+minuteString;
            }
            String secondString = seconds + "s";

            if(seconds <10){
                secondString = "0"+secondString;
            }


            return hourString+" "+minuteString + " "+ secondString + " ";
        }return INVALID_VALUE_MASSAGE;
    }
    public static  String getDurationString(int seconds) {
    if(seconds>=0){
    int minute = seconds/60;
    int SecReminder = seconds%60;

    String ans = getDurationString(minute,SecReminder);
    return ans;

    }return INVALID_VALUE_MASSAGE;



    }

}