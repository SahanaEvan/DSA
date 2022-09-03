package Arrays;
//RSA-rotated sorted array
public class A11_pairSumRSA {
    static boolean find_pair(int[] arr, int sum){
        //1.Find pivot
        int pivot=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]) {
                pivot++;
                break;
            }
        }
        //2.Use modulo operator and iterate to find the sum pair
        int left=pivot+1;
        int right=pivot;
        while(left!=right){
            if(arr[left]+arr[right]>sum){
                right=(arr.length+right-1)% arr.length;
            }
            if(arr[left]+arr[right]<sum){
                left=(left+1)%arr.length;
            }
            if(arr[left]+arr[right]==sum){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int arr[]={11, 15, 6, 8, 9, 10};
        System.out.println(find_pair(arr,16));

    }
}
