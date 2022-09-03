package Arrays;

public class binarySearch {
    static int binarysearch(int arr[],int low,int high,int key){
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                return binarysearch(arr,low,mid-1,key);
            else
                return binarysearch(arr,mid+1,high,key);
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={5,6,10,11,12,13,14};
        System.out.println(binarysearch(arr,0,arr.length-1,15));;
    }
}
