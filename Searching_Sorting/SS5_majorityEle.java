package Searching_Sorting;

public class SS5_majorityEle {
    //A majority element in an array A[] of size n is an element that appears more than n/2 times
    // (and hence there is at most one such element).
    static void major_ele(int arr[])
    {
        max_min_array MAX_MIN = new max_min_array();

        int min = MAX_MIN.min(arr);
        int max = MAX_MIN.max(arr);

        int temp[] = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] - min]++;
        }

        for (int i = 0; i < temp.length; i++) {
            if(temp[i]> arr.length/2) {
                System.out.println("Majority number:"+(i+min));
                return;
            }
        }
        System.out.println("No majority number present");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 3, 5, 2 };
        major_ele(arr);
    }
}
