public class NumberToWords {
    public static void main(String[] args) {
        int number = 0;
        numberToWords(number);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int originalDigitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reversedDigitCount = getDigitCount(reversedNumber);


        while (reversedNumber != 0) {
            int digit = reversedNumber % 10;

            switch (digit) {
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
            }

            reversedNumber /= 10;
        }

        int zerosToPrint = originalDigitCount - reversedDigitCount;
        for (int i = 0; i < zerosToPrint; i++) {
            System.out.println("Zero");
        }

    }


    public static int reverse(int number){

        int reverse = 0;
        while(number!=0){
            reverse = (reverse * 10) + number%10;
            number = number / 10;
        }
        return reverse;



    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        if (number == 0){
            return 1;
        }

        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }

        return count;
    }
}
