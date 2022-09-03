package Arrays;

public class PairSumSortedArray {
    static void find_pair(int arr[],int sum){
        int i=0,j=arr.length-1;
        while (i<=arr.length && j>=0){
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>sum){
                j--;
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9,20,11,15,26,38};
        int sum=35;
        find_pair(arr,sum);
    }
}
