public class Main {
    public static void main(String[] args) {
        //if else
        int value =1;
        if(value==1){
            System.out.println("Value was 1");
        } else if (value==2) {
            System.out.println("value was 2");
        }else System.out.println("was not 1 or 2");
        //new way Switch case (byte short char int)


        int Switchnum = 3;
        switch (Switchnum) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("value was 3");
                System.out.println("actually it was "+Switchnum);
                break; //break is vital close condition if dont do that the case will continue to the end
                //default=else
            default:
                System.out.println("Was not here ");
                break; //last one not naccessary cuz it is the end
        }//code move here

        // create a new switch statement using char instead of int
        // create a new char variable
        //create a switch statement testing for
        // A,B,C,D or E
        //Display a massage if any of these are found and then break
        // add a default which displays a message saying not found

        char ChaChaCha = 'N';
        switch (ChaChaCha){
            case 'A':
                System.out.println("It's " + ChaChaCha);
                break;
            case 'B':
                System.out.println("It's  "+ ChaChaCha);
                break;
            case 'C':
                System.out.println("It's "+ ChaChaCha);
                break;
            case 'D':
                System.out.println("It's  "+ ChaChaCha);
                break;
            default:
                System.out.println("not found");
        }//code move here

       /* String month="January";
        switch (month){
            case "January" : case "JAnuary": case "jaNuary" :
                System.out.println("It was"+month);
        }*/ //bad practice

        //good practice
        String month = "May";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            default:
                System.out.println("not found");
        }
    }
}