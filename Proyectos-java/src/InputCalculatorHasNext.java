import java.util.Scanner;

public class InputCalculatorHasNext {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
        public static void inputThenPrintSumAndAverage(){

            Scanner scanner = new Scanner(System.in);
            long sum = 0;
            int count = 0;

            while(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            long average = 0;
            if(count > 0){
                double rounded = (double) sum /count;
                average = Math.round(rounded);



            }
            System.out.println("SUM = " + sum + " AVG = " + average);

        }

}
