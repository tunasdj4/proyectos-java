 public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,99,999));
        System.out.println(isValid(10));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if ((first < 10 || first > 1000) || (second < 10 || second > 1000) || (third < 10 || third > 1000)) {
            return false;
        }

        int lastFirstDigit = first % 10;
        int lastSecondDigit = second % 10;
        int lastThirdDigit = third % 10;
        return (lastFirstDigit == lastSecondDigit) || (lastFirstDigit == lastThirdDigit) || (lastSecondDigit == lastThirdDigit);

    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
