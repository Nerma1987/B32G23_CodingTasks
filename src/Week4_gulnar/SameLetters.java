package Week4_gulnar;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        String str1 ="abcd";
        String str2 ="bcad";

        System.out.println(sameLetters(str1,str2));

    }

    public static boolean sameLetters(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */