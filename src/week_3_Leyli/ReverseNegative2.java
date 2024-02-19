package week_3_Leyli;

public class ReverseNegative2 {


    public static int reverseNegative(int num) {
        // Check if the number is negative
        boolean isNegative = num < 0;

        // If negative, make it positive
        if (isNegative) {
            num = -num;
        }

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

