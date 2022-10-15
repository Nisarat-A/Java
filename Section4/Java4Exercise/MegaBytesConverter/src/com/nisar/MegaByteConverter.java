package com.nisar;

public class MegaByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes<0){
        System.out.println("Invalid Value");
    }else {
        int megaBytes= kiloBytes/1024;
        int megaReminder = kiloBytes%1024;
        System.out.println(kiloBytes + " KB = "+ megaBytes+ " MB and "+megaReminder+" KB");
    }
    }
}
