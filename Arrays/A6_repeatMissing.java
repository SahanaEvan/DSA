package Arrays;

public class A6_repeatMissing {
    /**
     * Algorithm:
     * Traverse through the array.Use the absolute value of array element and use that to turn the element at that index negative
     * Now the element which is not negative is the missing element
     * If you come across an element which is already negative that's the duplicate
     */
    static void repeat_missing(int arr[])
    {
        int abs;
        for (int i = 0; i < arr.length; i++) {
            abs=Math.abs(arr[i]);
            if(arr[abs-1]>0)
                arr[abs-1]=-arr[abs-1];
            else
                System.out.println("Repeating element "+abs);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
                System.out.println("Missing element "+(i+1));
        }
    }

    public static void main(String[] args) {
        int arr[]={7, 3, 4, 5, 5, 6, 2 };
        repeat_missing(arr);

    }
}
