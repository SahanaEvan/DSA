package Arrays;

import static Searching_Sorting.SS3_CountSort.countsort;

public class A1_duplicate {
    //sort it-nlogn or linear
    static boolean has_duplicate(int arr[]){
        countsort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(has_duplicate(arr));
    }
}
