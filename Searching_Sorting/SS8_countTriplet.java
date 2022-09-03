package Searching_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SS8_countTriplet {
    static int count_triplet(int arr[],int n)
    {
        SS3_CountSort sort=new SS3_CountSort();
        sort.countsort(arr);
        System.out.println(Arrays.toString(arr));
        int j,k;
        int ans=0;
        for (int i = 0; i < arr.length-2; i++) {
            j=i+1;
            k= arr.length-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]>=n)
                    k--;
                else {
                    ans+=(k-j);
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={5, 1, 3, 4, 7};
        int key_sum=12;
        System.out.println(count_triplet(arr,key_sum));
    }
}
