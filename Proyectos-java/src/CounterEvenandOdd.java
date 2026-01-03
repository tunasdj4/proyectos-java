public class CounterEvenandOdd {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        while(number <= finishNumber){
            number++;
           if(!isEvenNumber(number)) {
               oddCount++;
               continue;
           }
           System.out.println("even number " + number);
            evenCount++;
           if(evenCount == 5){
               break;
           }
        }
        System.out.println("Total Even " + evenCount);
        System.out.println("Total Odd " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;

    }
}
