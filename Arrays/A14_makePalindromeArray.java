package Arrays;

import java.util.Arrays;

public class A14_makePalindromeArray {
    static int make_palindrome_array(int arr[]){
        int ans=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i-1];

                ans++;
            }
            else if(arr[i]>arr[j]){
                j--;
                arr[j]+=arr[j+1];

                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1, 4, 5, 1};
        System.out.println(make_palindrome_array(arr));
        System.out.println(Arrays.toString(arr));
    }
}
