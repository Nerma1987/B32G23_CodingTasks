package week6_Nerma;

public class MaxNum {

    public static void main(String[] args) {

        int[] numbers = {10, 100, 4084, 765, 30};
        maxNumberArray(numbers);
    }

    public static void maxNumberArray(int[] numbers){

        int maxNum = numbers[0];

        for(int i = 0; i < numbers.length-1; i++){

            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }

        }
        System.out.println("max = " + maxNum);
    }
}

