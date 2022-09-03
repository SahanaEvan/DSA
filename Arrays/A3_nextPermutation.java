package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class A3_nextPermutation {
    static void reverse(int arr[],int i,int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void next_permutation(int arr[])
    {
        //1. Find the largest index k such that a[k] < a[k + 1].
        // If no such index exists, the permutation is the last permutation.
        int k=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1])
                k++;
            System.out.println(k);
        }

        if(k==-1) {
            reverse(arr,k+1, arr.length);
            return;
        }   


        //2. Find the largest index l greater than k such that a[k] < a[l].
        int l=k+1;
        for (int i = k; i < arr.length; i++) {
            if(arr[l]>arr[i])
                l++;
        }

        //3. Swap the value of a[k] with that of a[l].
        int temp=arr[k];
        arr[k]=arr[l];
        arr[l]=temp;


        //4. Reverse the sequence from a[k + 1] up to and including the final element a[n].
        //reverseArray rev = new reverseArray();
        //rev.reverse(arr, k+1, arr.length-1 );
        reverse(arr, k+1, arr.length-1 );

    }

    public static void main(String[] args) {
        int arr[]= {3,1,2};
        next_permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
