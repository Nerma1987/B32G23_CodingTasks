package week_4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AABBCCDDD"));
    }

    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)){
                result+= each;
            }

        }
        return result;
    }
}
