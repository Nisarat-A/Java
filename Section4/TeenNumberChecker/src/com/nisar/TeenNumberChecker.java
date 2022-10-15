package com.nisar;

public class TeenNumberChecker {
    public static boolean hasTeen(int one,int two ,int three){
        if(((one)>=13&&(one<=19))||((two)>=13&&(two<=19))||((three)>=13&&(three<=19))){
            return  true;
        }return false;
    }
    public static boolean isTeen(int year){
    boolean ans = ((year)>=13&&(year<=19))? true:false;
    if (ans){
        return true;
    }return false;
    }
}
