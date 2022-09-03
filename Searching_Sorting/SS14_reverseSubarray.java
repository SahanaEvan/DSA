package Searching_Sorting;

import java.util.Arrays;

public class SS14_reverseSubarray {
    //reverse subarray to see if the array gets sorted
    static boolean reverse_subarray(int arr[])
    {
        //make a copy of array and sort it
        int temp[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        Arrays.sort(temp);

        int front=0;

        while(front<arr.length)
        {
            if(temp[front]!=arr[front])
                break;
            front++;
        }

        int rear=arr.length-1;
        while(rear>=0)
        {
            if(temp[rear]!=arr[rear])
                break;
            rear--;
        }
        if(front>=rear)
            return true;

        do{
            front++;
            if(arr[front-1]<arr[front])
                return false;

        }while(front!=rear);

        return true;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 40, 3};

        if (reverse_subarray(arr)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
