package Searching_Sorting;

public class SS7_pairDiff {
    static void pair_diff(int arr[],int diff)
    {
        int i=0;
        int j=1;
        while(i<arr.length&& j<arr.length)
        {
            if(i!=j && ((arr[i]-arr[j]==diff)||(arr[j]-arr[i]==diff))){
                System.out.println("("+arr[i]+","+arr[j]+")");
                return;
            }
            else if(arr[j]-arr[i]<diff)
                j++;
            else i++;
        }
        System.out.print("No such pair");
    }

    public static void main(String[] args) {
        int arr[]={1, 8, 30, 40, 100};
        int n = -60;
        pair_diff(arr,n);
    }
}
