package Arrays;

import java.util.Arrays;
import static Searching_Sorting.max_min_array.max;
public class trial {
    static void my_sort(int arr[])
    {
        int maxi=max(arr);
        int temp[]=new int[maxi];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]-1]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
        int j=0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]!=0 ) {
                arr[j] = temp[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={4,10,1,1};
        my_sort(arr);
    }
}
