package week6_diana;

public class MaxInArray {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};
        maxNumberArray(numbers);
    }

    public static void maxNumberArray(int[] numbers){

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++){

            if(numbers[i] > max){
                max = numbers[i];
            }

        }
        System.out.println("max = " + max);
    }
}
