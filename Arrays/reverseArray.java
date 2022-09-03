package Arrays;

import java.util.Arrays;

public class reverseArray {
    static void reverse(int arr[],int i,int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void reverse(String arr[],int i,int j)
    {
        String temp="";
        while(i<j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String arr[]={"2","3","4","5","6"};
        reverse(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
// 1 2 3 4 5 7 i=1 j=4
//   i     j
// 1 5 3 4 2 7 i=2 j=3
//     i j
// 1 5 4 3 2 7
