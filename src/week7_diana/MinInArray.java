package week7_diana;

public class MinInArray {

    public static void main(String[] args) {
        int[] numbers = {100, 20, 500, 40, -10, 30};
        minNumberArray(numbers);
    }

    public static void minNumberArray(int[] numbers){

        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
    }
}
