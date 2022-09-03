package Arrays;

import static Arrays.binarySearch.binarysearch;

public class A4_searchRotatedSortedArray{
    static  int search(int arr[],int key){
        int pivot_indx=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1])
                pivot_indx++;
        }


        int first_half=binarysearch(arr,0,pivot_indx-1,key);
        System.out.println(first_half);
        int sec_half=binarysearch(arr,pivot_indx,arr.length-1,key);
        System.out.println(sec_half);

        int res=(first_half>sec_half)? first_half:sec_half;
        return res;
    }

    public static void main(String[] args) {
        int arr[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key=4;
        System.out.println(search(arr,key));

    }
}
