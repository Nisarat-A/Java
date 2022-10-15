package com.nisar;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int Time) {
        if(barking==false){
            return false;
        }
        else if (Time<0||Time>23){
            return false;
        } else if (Time<8||Time>22) {
            return true;
        }else {
            return false;
        }
    }
    }
