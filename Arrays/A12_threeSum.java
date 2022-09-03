package Arrays;

import java.util.Arrays;
import Searching_Sorting.SS3_CountSort;

import static Searching_Sorting.SS3_CountSort.countsort;

public class A12_threeSum {
    static void three_sum_cube(int arr[]){
        int triplet[]=new int[3];
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==0){
                        triplet[0]=arr[i];
                        triplet[1]=arr[j];
                        triplet[2]=arr[k];
                        System.out.println(Arrays.toString(triplet));
                    }
                }
            }
        }
        //return triplet;
    }
    static void three_sum(int arr[]){
        countsort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l=0;
            int r=arr.length-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r]==0)
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        //System.out.println(Arrays.toString(three_sum(arr)));
        three_sum(arr);
    }
}
