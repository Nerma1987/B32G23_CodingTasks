package week4_diana;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
    }

    public static String removeDuplicates(String str){
        String result = "";

        for(int i = 0; i < str.length()-1; i++){
            char each = str.charAt(i);

            if(!result.contains("" + each)){
                result += each;
            }
        }
        return result;

    }

}
