package week6_gulnar;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidationTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your password:");
        String password = input.nextLine();
        if (isValid(password)) {
            System.out.println("valid password");
        } else {
            System.err.println("invalid password");
        }

        input.close();

    }


    public static boolean isValid(String password) {

        // check the given string is at least 6 characters in length
        if (password.length()<6){
            return false;
        }

        // these rest are boolean points, these are must be true so that the password condition is true
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;
        boolean containsSpecialCharacters =false;

        //iterate the string
        for (int i = 0; i < password.length(); i++) {
            char ch =password.charAt(i);

            //check for upper case
            if (Character.isUpperCase(ch)){
               containsUpperCase = true;
            }
            //check for lower case
            if (Character.isLowerCase(ch)){
                containsLowerCase = true;
            }
            //check for digit
            if (Character.isDigit(ch)){
                containsDigit =true;
            }
            // check for special character
            if (!Character.isLetterOrDigit(ch)){
                containsSpecialCharacters = true;
            }

        }
        // if all of them true, then the password is valid

        return (containsUpperCase && containsLowerCase && containsDigit && containsSpecialCharacters);



    }


}

/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
 */