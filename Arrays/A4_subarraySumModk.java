package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A4_subarraySumModk {
    static int subarray_sum_modk(int arr[],int k)
    {
        int aux[]=new int[arr.length];
        aux[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            aux[i]=aux[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(aux));
        for (int i = 0; i < aux.length; i++) {
            aux[i]=aux[i]%k;
        }
        int l=arr.length-1;
        while(l>=0)
        {
            if(aux[l]==0)
                return l;
            l--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2, 7, 6, 1, 4, 5};
        System.out.println(subarray_sum_modk(arr,3));
    }
}
