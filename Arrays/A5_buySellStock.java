package Arrays;

public class A5_buySellStock {
    static int max_profit(int arr[]){
        int max_prof=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1])
                max_prof+=(arr[i]-arr[i-1]);
        }
        return max_prof;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        System.out.println(max_profit(arr));
    }
}
