public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(8128));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1){
            return false;
        }



        int original = number;
        int sum = 0;
         for (int i = 1; i <= original / 2; i++){
             if (original  % i == 0){
                 sum += i;
             }
         }
         return sum == original;
    }
}
