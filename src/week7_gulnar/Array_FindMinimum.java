package week7_gulnar;

public class Array_FindMinimum {

    public static void main(String[] args) {

        int[] arr = {11,4,7,24,9};
        System.out.println(findMinimum(arr));

    }

    public static int findMinimum(int[] array){
        int min = array[0];
        for (int each : array) {
            if (each<min){
                min =each;
            }
        }
        return min;
    }
}
