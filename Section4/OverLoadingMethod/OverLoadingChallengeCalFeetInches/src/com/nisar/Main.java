package com.nisar;
public class Main {
    public static void main(String[] args) {
        double centimeters = CalcFeetAndInchesToCentimeters(6,5);
        if(centimeters<0.0){
            System.out.println("Invalid feet or inch parameters");
        }
        CalcFeetAndInchesToCentimeters(150);
    }
    public static double CalcFeetAndInchesToCentimeters(double feet,double inch) {
    if (feet<0||inch<0||inch>13){
        System.out.println("invalid feet or inch parameter");
        return -1;
    }double centimeters = (feet*12)*2.54d;
    centimeters += inch*2.54d;
        System.out.println(feet+" feet"+inch+" inches ="+centimeters+" cm.");
        return centimeters;
    }

    public static double CalcFeetAndInchesToCentimeters(double inch) {
        if(inch <0){
            return -1;
        }double feet= (int)inch/12;
         double reminder = (int)inch%12 ;
        System.out.println(inch+"inches = "+feet+" feet and"+reminder+" inches");
         return CalcFeetAndInchesToCentimeters(feet,reminder);
        }



    }


    
