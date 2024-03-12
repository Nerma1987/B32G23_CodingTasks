package week7_diana;

import java.util.Arrays;

public class AscendOrderArray {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        System.out.println("Sorted in ascending order: " + Arrays.toString(sortAscendingOrder(numbers)));
    }

    public static int[] sortAscendingOrder(int[] numbers){

        int temp = 0;

        for(int i = 0; i < numbers.length;i++){

            for (int j = 0; j < numbers.length-1;j++){

                if(numbers[j] > numbers [j + 1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
