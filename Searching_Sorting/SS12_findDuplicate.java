package Searching_Sorting;

public class SS12_findDuplicate {
    static void find_duplicate(int arr[]){
        for (int i = 0; (i < arr.length); i++) {
            if(arr[Math.abs(arr[i])]>0)
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i])+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4, 2, 4, 5, 2, 3, 1};
        find_duplicate(arr);
    }
}
