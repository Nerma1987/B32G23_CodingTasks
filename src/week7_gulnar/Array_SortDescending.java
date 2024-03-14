package week7_gulnar;

import java.util.Arrays;

public class Array_SortDescending {

    public static void main(String[] args) {
        int[] array ={12,3,2,6,23,1};

        System.out.println(Arrays.toString(sortDescending(12,3,2,6,23,1)));
    }

    public static int[] sortDescending(int... arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.println("-----------------------i: "+i);
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]<arr[j+1]){
                    System.out.println("swapping "+arr[j]+" and "+arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
                System.out.println("array after j index of "+j +" | "+Arrays.toString(arr));
            }
        }
        return arr;
    }
}
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//arr = Sort(arr); ==> {90, 20, 10, 8, 7};