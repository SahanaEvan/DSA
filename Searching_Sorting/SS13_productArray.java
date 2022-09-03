package Searching_Sorting;

public class SS13_productArray {
    static void product_array(int arr[])
    {
        int product[]=new int[arr.length];

        int left[]=new int[arr.length];
        int right[]=new int[arr.length];

        left[0]=1;
        right[arr.length-1]=1;

        for (int i = 1; i < arr.length; i++) {
            left[i]=arr[i-1]*left[i-1];
        }
        for(int j=arr.length-2;j>=0;j--){
            right[j]=arr[j+1]*right[j+1];
        }
        for (int i = 0; i < arr.length; i++) {
            product[i]=left[i]* right[i];
            System.out.println(product[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={ 10, 3, 5, 6, 2 };
        product_array(arr);
    }
}
