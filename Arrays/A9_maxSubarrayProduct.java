package Arrays;

public class A9_maxSubarrayProduct {
    static int max_subarray_product(int arr[]){
        int max_product=0;
        int product;
        for (int i = 0; i < arr.length-1; i++) {
            product=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]*arr[j]>product)
                    product=arr[i]*arr[j];
                else
                    break;
            }
            if(product>max_product)
                max_product=product;
        }
        return max_product;
    }

    public static void main(String[] args) {
        int arr[]={-2,0,-1,8,6};
        System.out.println(max_subarray_product(arr));
    }
}