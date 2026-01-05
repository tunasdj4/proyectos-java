public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public  static boolean hasSharedDigit(int number, int digit) {
        if ((number < 10 || number > 99) || (digit < 10 || digit > 99)) {
            return false;
        }
        int lastNumber = number % 10;
        int firstNumber = number / 10;
        int lastDigit = digit % 10;
        int firstDigit = digit / 10;
        
        return (lastNumber == lastDigit) || (firstNumber == firstDigit) || (lastNumber == firstDigit) || (lastDigit == firstNumber);
        
    }
    
}
