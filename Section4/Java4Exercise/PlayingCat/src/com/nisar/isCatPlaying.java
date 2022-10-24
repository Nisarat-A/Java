package com.nisar;
public class isCatPlaying {
    public static boolean isCatPlaying(boolean summer, int temperature){
    if (summer){
        boolean ss = (temperature>=25 && temperature<=45)?true:false;
        if (ss){
        return true;}return false;
    }else if (temperature >=25 && temperature<=35){
        return true;
    }return false;
    }
}
