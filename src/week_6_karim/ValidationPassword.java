package week_6_karim;

import javax.swing.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPassword {
    public static void main(String[] args) {

String password="1265@l3#SlokkjwA";
        System.out.println("checkPassword(password) = " + checkPassword(password));

    }

    public static Boolean checkPassword(String password){

 if (password.length()<6 || password.contains(" ")){

     System.out.println("Invalid length or contains space ");
     return false;
 }

     Boolean hasUpperCase=false;
     Boolean hasLowerCase=false;
     Boolean hasDigit=false;
     Boolean hasSpecialCharacter=false;

         for (char ch :password.toCharArray()){

             if(Character.isUpperCase(ch)){
                 hasUpperCase=true;
             }
             if(Character.isLowerCase(ch)){
                 hasLowerCase=true;
             }
             if(Character.isDigit(ch)){
                 hasDigit= true;
             }
//             if(!Character.isWhitespace(ch)){
//                 hasSpecialCharacter=true;
//             }

             if(!Character.isLetterOrDigit(ch)){
                 hasSpecialCharacter=true;
             }
         }
        if (!hasUpperCase) {
            System.out.println("Missing uppercase letter");
            return false;
        }
        if (!hasLowerCase) {
            System.out.println("Missing lowercase letter");
            return false;
        }
        if (!hasDigit) {
            System.out.println("Missing digit");
            return false;
        }
        if (!hasSpecialCharacter) {
            System.out.println("Missing special character");
            return false;
        }
        return true;
    }


}
