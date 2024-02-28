package week5_Nerma;

public class Reverse_String {
    public static void main(String[] args) {

        reverseMethod("Banana");

    }

    public static String reverseMethod(String str){

        String reverse ="";

        for (int i = str.length()-1; i >= 0; i--) {
            char CH = str.charAt(i);
            reverse +=CH;
        }
        System.out.println(reverse);
        return reverse;
    }
}


