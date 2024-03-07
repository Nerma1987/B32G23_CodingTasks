package week6_Nerma;

public class StringPassValidation {

    public static void main(String[] args) {

        System.out.println(isValidPassword("Ner"));
    }

    public static boolean isValidPassword(String password) {
        boolean c1 = password.length() >= 6 && !password.contains(" ");

        boolean c2 = false;
        boolean c3 = false;
        boolean c4 = false;
        boolean c5 = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                c2 = true;
            } else if (Character.isLowerCase(ch)) {
                c3 = true;
            } else if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                c4 = true;
            } else {
                c5 = true;
            }
        }
        return c1 && c2 && c3 && c4 && c5;
    }
}
/*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false*/
