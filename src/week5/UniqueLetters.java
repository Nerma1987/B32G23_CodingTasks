package week5;

import java.util.*;

public class UniqueLetters {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));


    }
    public static String unique(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i); //returns the character in specific place in the string, so assigning them one by one into ch
            if (str.indexOf(ch) ==str.lastIndexOf(ch)){ //ch showed up for the first time as well as fot the last time in the loop
                result +=ch;

            }
        }

        return result;
    }

    /*
    ----String --> indexOf method -- first time it shows up
    ----String --> LastIndexOf method -- last time it shows up

     */


}



/*
String -- Find the unique
Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */