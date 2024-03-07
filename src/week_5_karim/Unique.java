package week_5_karim;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique {

    public static void main(String[] args) {



        String str="AAABBBCCCDEF";

        System.out.println("unique(str) = " + unique(str));
    }
    public static String unique(String str){


        Map<Character,Integer> charCount=new HashMap<>();
        StringBuilder result=new StringBuilder();

        for(char c:str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for(char c:str.toCharArray()){
            if(charCount.get(c)==1){
                result.append(c);
            }
        }



        return result.toString();



  }

}
