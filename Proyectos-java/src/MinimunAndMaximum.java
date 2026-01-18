import java.util.Scanner;

public class MinimunAndMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean flag = false;
        System.out.println("Enter the numbers: ");

        do {
            String num = scanner.nextLine();
            System.out.println("Enter next number:");

            try{
                int number = Integer.parseInt(num.trim());
                if (!flag) {
                    min = number;
                    max = number;
                    flag = true;
                }
                if(number < min){
                    min = number;
                }
                if(number > max){
                    max = number;
                }
            }catch (NumberFormatException e){
                break;
            }

        } while (true);

        if(flag){
            System.out.println("Min: " + min + " | Max: " + max);
        }


    }
}

