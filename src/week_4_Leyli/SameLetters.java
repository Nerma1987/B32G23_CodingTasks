package week_4_Leyli;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println(areSameLetters("abc", "cab"));
        System.out.println(areSameLetters("abc", "abb"));
    }

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



/*
String -- Same letters Write a return method that check if a string is build out of the same letters as another string.
 Ex: same("abc", "cab"); -> true
     same("abc", "abb"); -> false:
 */