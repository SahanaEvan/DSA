package Searching_Sorting;

public class SS4_ceil {
    static int ceil(int arr[],int k) {
        if (k < arr[0])
            return arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k)
                return k;
            if (arr[i] < k && arr[i + 1] > k)
                return arr[i+1];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,6,10};
        int key=7;
        int ans=ceil(arr,key);
        System.out.println(ans);
    }
}
