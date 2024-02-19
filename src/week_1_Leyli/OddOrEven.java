package week_1_Leyli;

public class OddOrEven {

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        System.out.println(num1 + " is " + identify(num1));
        System.out.println(num2 + " is " + identify(num2));
    }
}

