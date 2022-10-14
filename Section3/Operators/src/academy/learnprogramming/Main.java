package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
    int result = 1+2; //1+2=3 2operand
        //3 = single operand
        System.out.println("1+2= "+result);
        // comment
        int previousResult = result;
        System.out.println("previousresult = " + previousResult);
        result = result -1; //3-1 = 2
        System.out.println("3-1 = " + result);
        System.out.println("previousresult = " + previousResult);
        result = result* 10 ; //2*10=20
        System.out.println("2*10 = " + result );
        result = result/5 ; //20/5 =4
        System.out.println("20/5 = " + result);
        result =result%3; //reminder (4%3)=1
        System.out.println("4%3 = " + result);
        //result ++ = result = result + 1
        result++; //1+1 =2
        System.out.println("1+1 = " + result);

        result--; //2-1 =1
        System.out.println("2-1 = " + result);
        //result = result +2;
        result += 2; //1+2 = 3
        System.out.println("1+2 = " +result);
        //result = result*10
        result *= 10; // 3*10=30
        System.out.println("3*10 = " + result);

        //result = result/3
        result /= 3; //30/3=10
        System.out.println("30/3 = " + result );

        //result = result -2
        result -= 2;
        System.out.println("10-2 = " + result);


        boolean RaTahLoneliness = !true ;

        boolean NoeyIsCute = false;
        if (NoeyIsCute==false) {
            System.out.println("Nobody is cute");
            System.out.println("Cuz Noey is cutest");
        }




        int topScore = 95;
        if(topScore <= 100){
            System.out.println("you got the high score!");
        }

        int secondTopScore = 81;
        if((topScore>secondTopScore) && (topScore <100)) {
            System.out.println("Greater than second top and less than 100");
        }

        if((topScore>90) || (secondTopScore<90) ){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue=50;
        if(newValue == 50){ //int must turn to boolean  to compare by ==
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){ //new assign from isCar false to true
            System.out.println("This is not supposed to happen ");
        }

        isCar =true;
        boolean wasCar = isCar ? true:false;

        if(wasCar){
            System.out.println("wasCar is true");
        }
        // ternary is shortcut if then else



        double fistDouble=20.00d , secondDouble=80.00d;
        double TotalDouble = (fistDouble+secondDouble) * 100.00d;
        double Reminder = TotalDouble%40.00d;
        boolean isNoReminder = (Reminder==0)? true :false;
        if (!isNoReminder){
            System.out.println("Got some Reminder");
        }





















    }
}