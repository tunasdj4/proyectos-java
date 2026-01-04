public class FactorPrinter {
    public static void main(String[] args) {
        int y = 6;
        printFactors(y);

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int x = 1;
        while (x <= number) {
            if (number % x == 0) {
                System.out.println(x);
            }
            x ++;

        }
    }
}

