package week_4_Karim;

public class FrequencyOfChars {

    public static void main(String[] args) {


        String str="AAABBCDD";

        System.out.println(frequencyOfChars(str));


    }

    public static String frequencyOfChars(String str){

        String result="";



        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch=str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
                if(result.contains(""+ch)){
                    continue;
                }
                result+=ch+""+count;

            }
                    return result;
        }




    }

