package Week4_gulnar;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcdeed";
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String str){
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result +=ch;
            }
        }
        return result;

    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */