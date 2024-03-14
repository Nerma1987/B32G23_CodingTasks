package week6_Nerma;

public class StringSumOfDigits {

    public static void main(String[] args) {


        String string = "15 java 3 monkey 3";

         System.out.println(sumOfDigitInString(string));
    }

    public static int sumOfDigitInString(String string) {
        int sum = 0;

        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }



        }
return sum;
    }


}