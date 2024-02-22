package week3_diana;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println("reverseNegative(-1234) = " + reverseNegative(-1234));
    }


    public static int reverseNegative(int num){//revers the order of -1234

        int positiveNumber = Math.abs(num);

        int reversed = 0;

        while(positiveNumber > 0){

            int lastDigit = positiveNumber % 10;
            reversed = reversed * 10 + lastDigit;
            positiveNumber /= 10;

        }
        return reversed;
    }
}
