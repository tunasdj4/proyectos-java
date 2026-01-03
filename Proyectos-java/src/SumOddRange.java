public class SumOddRange{
    public static void main(String[] args) {
        
    }

    public static boolean  isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

        
public static int sumOdd(int start, int end){
        if (start <= 0 || end <= 0 || end < start){
           return -1; 
        }

        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum  += 1;
            }
        }
        return sum;

    }
}