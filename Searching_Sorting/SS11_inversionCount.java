package Searching_Sorting;

public class SS11_inversionCount {
    static int inversion_count(int arr[])
    {

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 6};
        System.out.println(inversion_count(arr));

    }
}
