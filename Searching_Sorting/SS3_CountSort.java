package Searching_Sorting;

import java.util.Arrays;

public class SS3_CountSort {
    public static void countsort(int arr[]) {
        max_min_array MAX_MIN = new max_min_array();

        int min = MAX_MIN.min(arr);
        int max = MAX_MIN.max(arr);

        int temp[] = new int[max - min + 1];//using extra place so not inplace.
        //Also if range is not consistent and its huge or has an outlier then its a waste of space
        int output[] = new int[arr.length];
        //building the count array
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] - min]++;
        }
        //transform the count array into a frequence array
        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }
        //sorting-do it from behind to make it a stable algorithm
        for (int i = arr.length - 1; i >= 0; i--) {
            output[temp[arr[i] - min] - 1] = arr[i];
            temp[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {-5, -10, 0, -3, 8, 5, -1, 10};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
