package week_4_Karim;

import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {



        String original="AAABBBCCC";
        String result=removeDup(original);
        System.out.println("result = " + result);


    }


    public static String removeDup(String str){

        Set<Character> unique=new HashSet<>();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            char currentChar=str.charAt(i);
            if(unique.add(currentChar)){
                sb.append(currentChar);
            }

        }

        return sb.toString();


    }
}
