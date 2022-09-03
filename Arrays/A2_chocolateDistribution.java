package Arrays;

import java.util.Arrays;

public class A2_chocolateDistribution {
    static int distribute(int arr[],int m)
    {
        Arrays.sort(arr);
        int first=0;
        int last=m-1;
        if(arr.length<m)
            return -1;
        int min_diff=arr[last]-arr[first];
        while(last<arr.length-1)
        {
            first++;
            last++;
            if(arr[last]-arr[first]<min_diff)
                min_diff=arr[last]-arr[first];
        }
        return min_diff;
    }

    public static void main(String[] args) {
        int arr[]={12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
                50};
        int m=7;
        System.out.println("Minimum difference is "
                + distribute(arr, m));
    }
}
