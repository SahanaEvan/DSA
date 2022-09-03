package Searching_Sorting;

public class SS6_searchK {
    static void search(int arr[],int key,int diff)
    {
        int i=0;
        while(i< arr.length)
        {
            if(arr[i]==key) {
                System.out.println("The number is present at index "+i);
                return;
            }

            i=i+Math.max(1,Math.abs(arr[i]-key)/diff);
        }
        System.out.println("The number is not present");
    }

    public static void main(String[] args) {
        int arr[]={ 2, 4, 5, 7, 7, 6 };
        int key = 6;
        int diff = 2;
        search(arr,key,diff);
    }
}
