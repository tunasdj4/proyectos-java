public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.print(sumFirstAndLastDigit(125));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        System.out.println("El ultimo número es = " + lastDigit);

        int firstDigit = number;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        System.out.println("El primer número es = " + firstDigit);



        return firstDigit + lastDigit;
    }
}
