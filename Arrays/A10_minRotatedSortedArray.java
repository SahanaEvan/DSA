package Arrays;

public class A10_minRotatedSortedArray {
    private static void partition(int[] arr, int low, int high) {
        int pivotloc = low;
        int pivot = arr[high];

        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotloc);
                pivotloc++;
            }
        }

        swap(arr, pivotloc, high);

    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,13,15,17};
        partition(arr,0,arr.length-1);
        System.out.println(arr[0]);
    }
}
