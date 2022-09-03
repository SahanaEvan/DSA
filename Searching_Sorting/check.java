package Searching_Sorting;

import java.util.Arrays;

public class check {
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,9};
        System.out.println(arr[2]);
        System.out.println(arr[4]);
        swap(arr[2],arr[4]);

        System.out.println(arr[2]);
        System.out.println(arr[4]);
    }
}
