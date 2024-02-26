package week5;

import java.security.PublicKey;

public class ReverseString {

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverseString(str));


    }

    public static String reverseString(String str){
        String reverse ="";
        for (int i = str.length()-1; i >= 0; i--) { // from the last index till the first index
            reverse += str.charAt(i); // restore each letter on specific index into the reverse string
        }

        return reverse;
    }
}
/*
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA

==last index of str -->length()-1
==the first character index is 0, so it should iterate till it reaches the first letter.
 */