public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(81));
    }
    public static int getLargestPrime(int number){
      if (number>=2){
          for (int i =2 ; i<number  ; i++){
                if (number%i == 0 ){
                    number /= i;
                    i--;
                }
          }                return number;







      }
      return -1;
    }

}
