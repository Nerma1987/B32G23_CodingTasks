package week_4_Leyli;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String word){

        String result = "";


        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i); // each character from string
            int count = 0;

            for(int j = 0; j < word.length(); j++){ // to find of frequency of each character
                if(word.charAt(j) == ch){ // each character of word
                    count++;
                }
            }
            if(result.contains("" + ch)){
                continue;
            }
            result += ch + "" + count;

        }

        return result;



    }
}


/*
String -- Frequency of Characters Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


 */