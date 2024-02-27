package week5_diana;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reversString("ABCD"));


    }

    public static String reversString(String str){

        String reverse = "";

        for(int i = str.length()-1; i >=0; i--){

            char ch = str.charAt(i);
            reverse += ch;

        }

        return reverse;
    }
}
