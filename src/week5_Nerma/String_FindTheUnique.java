package week5_Nerma;

public class String_FindTheUnique {

    public static void main(String[] args) {
        unique("AAABBBCCCDEF");

    }
    public static void unique(String str){

    String unique = "";

        for (int i = 0; i < str.length(); i++) {
        char each = str.charAt(i);

        if(str.indexOf(each) == str.lastIndexOf(each)){
            unique += each;

        }
    }
        System.out.println(unique);

}


}
/*String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

