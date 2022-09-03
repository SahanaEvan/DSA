package Searching_Sorting;

public class max_min_array {
    public static int max(int[] arr)
    {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    static int min(int[] arr)
    {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
