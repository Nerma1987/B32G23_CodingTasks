package week6_gulnar;

public class SumOfDigitsInString {
    public static void main(String[] args) {

        String str = "she2ij4h4j2k1";

        System.out.println(sumOfDigitInString(str));

    }
    public static int sumOfDigitInString(String str){
        int sum =0; // define the sum variable
        for (int i = 0; i < str.length(); i++) { //iterate the str in parameter
            char ch = str.charAt(i); // declare the char in each element of the str
            if (Character.isDigit(ch)){ // use Character class to check the content of str, whether it is digit or not
                String digitsFromStr = str.substring(i,i+1); // declare the new only digits str from parameter str
                sum += Integer.parseInt(digitsFromStr); // accumulate the digits in math
            }
        }
        return sum; // return the sum

    }

}
//Write a method that can return the sum of the digits in a string