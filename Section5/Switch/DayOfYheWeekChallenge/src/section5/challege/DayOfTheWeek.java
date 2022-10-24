package section5.challege;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(4);
        printDayOfTheWeekBonus(7);
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }}

        public static void printDayOfTheWeekBonus(int newDays){
            if (newDays==0){
                System.out.println("Sunday");
            } else if (newDays==1) {
                System.out.println("Monday");
            } else if (newDays==2) {
                System.out.println("Tuesday");
            } else if (newDays==3) {
                System.out.println("Wednesday");
            } else if (newDays==4) {
                System.out.println("Thursday");
            } else if (newDays==5) {
                System.out.println("Friday");
            } else if (newDays==6) {
                System.out.println("Saturday");
            } System.out.println("Invalid Value");

        }}

