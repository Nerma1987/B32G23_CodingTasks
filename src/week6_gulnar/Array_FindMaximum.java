package week6_gulnar;

public class Array_FindMaximum {

    public static void main(String[] args) {

        int[] arr = {2,4,2,76,340,72};
        System.out.println(maxNumber(arr));
    }

    public static int maxNumber(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }

        return max;
    }

}
//Write a method that can find the maximum number from an int Array