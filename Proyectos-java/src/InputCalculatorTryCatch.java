import java.util.Scanner;

public class InputCalculatorTryCatch {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        int count = 0;

        while(true){
            int number;
            String value = scanner.nextLine();
            try{
               number = Integer.parseInt(value);
            }catch(NumberFormatException e){
                break;
            }
            sum += number;
            count++;
        }
        long  average = 0;
        if (count > 0){
            double sumD = sum;
            sumD /= count;
            average = Math.round(sumD);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

}
