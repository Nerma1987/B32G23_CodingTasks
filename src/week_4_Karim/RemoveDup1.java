package week_4_Karim;

public class RemoveDup1 {
    public static void main(String[] args) {

        String original="AAABBBCCC";
        String result=removeDup(original);
        System.out.println("result = " + result);


    }

    public static String removeDup(String str){


        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char currentChar=str.charAt(i);

            if(result.indexOf(currentChar)==-1){
                result+=currentChar;
            }
        }
        return result;


    }
}
