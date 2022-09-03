package Searching_Sorting;

public class SS15_median {
    static int median(int a[],int b[])
    {
        int m=a.length;
        int n=b.length;

        int i=0;
        int j=0;

        int bound=(m+n)/2;

        while(bound!=0 && i<m && j<n)
        {
            if(a[i]<b[j]) i++;
            else j++;

            bound--;
        }
        if(i>j)
        return a[i];
        else
            return a[j];
    }

    public static void main(String[] args) {
        int arr[]={ 900 };
        int a[]={ 5, 8, 10, 20 };

        System.out.println(median(arr,a));
    }
}
