public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(50,725));
        System.out.println(getDurationString(65024));
    }
    private static String  getDurationString(int Second,int Minute){
        if((Second<0)||(Minute<0)||(Second>59)) {
            return "Invalid Value";
        }
        int hour= Minute/60;
        int reminder = Minute%60;
        return hour+"h "+reminder+"m "+Second+"s";
    }
    private static String  getDurationString(int Second){
        if (Second<0){
            return "Invalid Value";
        }
        int  minute = Second/60;
        int secReminder = Second%60;
        String x = getDurationString(secReminder,minute);
        return x;
    }

    }