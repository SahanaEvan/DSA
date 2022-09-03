package Searching_Sorting;

import java.util.Arrays;

public class SS10_radixSort {
    static void countSort(int arr[],int exp)
    {
        int output[]=new int[arr.length];
        int count[]=new int[10];

        //count sort the digits
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/exp)%10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i]+=count[i-1];
        }

        for (int i = arr.length-1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]= output[i];
        }
    }
    static void radixSort(int arr[])
    {
        max_min_array MAX_MIN = new max_min_array();
        int max = MAX_MIN.max(arr);

        for(int exp=1;max/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }

    public static void main(String[] args) {
        int arr[]={ 170, 45, 75, 90, 802, 24, 2, 66 };
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
