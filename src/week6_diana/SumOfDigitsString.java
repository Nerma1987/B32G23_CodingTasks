package week6_diana;

public class SumOfDigitsString {

    public static void main(String[] args) {

        System.out.println(sumOfDigitsInString("1I3love48Java4"));
    }

    public static int sumOfDigitsInString(String str){

        int sum = 0;

        for(int i = 0; i < str.length(); i++){//iterate through each character in the string
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){//check if the character is a digit
                sum += (ch - '0');//convert character to an integer and add to the sum
            }
        }
        return sum;
    }
}
