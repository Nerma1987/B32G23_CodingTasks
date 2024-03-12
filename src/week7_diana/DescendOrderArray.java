package week7_diana;

import java.util.Arrays;

public class DescendOrderArray {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        System.out.println("Sorted in descending order: " + Arrays.toString(sortDescendingOrder(numbers)));
    }

    public static int[] sortDescendingOrder(int[] numbers){

        int temp = 0;

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers.length-1; j++){

                if(numbers[j] < numbers[j + 1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }
        }
        return numbers;
    }
}
