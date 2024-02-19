package week4_diana;

public class SameLetters {

    public static boolean areSameLetters(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }


        for(char each : str1.toCharArray()){
            int index = str2.indexOf(each);
            if(index == -1){
                return false;
            }

            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }
        return str2.isEmpty();
    }
}
