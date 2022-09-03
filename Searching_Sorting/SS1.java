package Searching_Sorting;

import java.util.Arrays;

public class SS1 {
    //	Permute Two Arrays such that Sum of Every Pair is Greater or Equal to K
    static void sort(int arr[])
    {
        int temp;
        int min;
        for (int i = 0; i < arr.length-1; i++) {
            min=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<min)
                {
                    //swap them
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    static void reverse(int arr[])
    {

        int start=0;
        int end= arr.length-1;
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }
    static boolean isPossible(int a[],int b[],int k)
    {
        sort(a);
        sort(b);
        reverse(b);

        for (int i = 0; i < a.length; i++) {
            if(a[i]+b[i]<k) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a={2,1,3};
        int[] b={7,9,8};
        int k=10;

        if(isPossible(a,b,k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
