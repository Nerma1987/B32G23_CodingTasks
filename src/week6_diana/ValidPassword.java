package week6_diana;

public class ValidPassword {

    public static void main(String[] args) {

        System.out.println(isValidPassword("1Leonard@"));
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
            } else if (Character.isDigit(ch)) {
                c4 = true;
            } else {
                c5 = true;
            }
        }
        return c1 && c2 && c3 && c4 && c5;
    }
}
