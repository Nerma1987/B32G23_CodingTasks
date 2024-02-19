package week_3_Leyli;

public class ReverseNegativeNumber {

        public static int reverseNegative(int num) {

        // Check if the number is negative
        boolean isNegative = num < 0;

        // Convert the number to positive for reversal
        num = Math.abs(num);

        // Reverse the number
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Convert back to negative if the original number was negative
        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        int number = -12345;
        int reversedNumber = reverseNegative(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}



