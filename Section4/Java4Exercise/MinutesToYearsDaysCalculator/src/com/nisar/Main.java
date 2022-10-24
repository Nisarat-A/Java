package com.nisar;
public class Main {
    public static void printYearsAndDays(long minutes){
    if(minutes>=0) {
        long days = (minutes / 60) / 24;
        long years = days / 365;
        long reminderDays = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + reminderDays + " d");
    } else {
        System.out.println("Invalid value");
    }
    }
    }