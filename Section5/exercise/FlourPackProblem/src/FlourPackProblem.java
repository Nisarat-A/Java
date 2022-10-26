public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(15,5,9));
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if (bigCount<0 || smallCount <0 || goal <0 ){
            return false;
        }else if( ((bigCount*5)+smallCount)<goal){
            return false;
        }else {
            int remainder = goal%5;
          return remainder <= smallCount;


        }
    }
}
