package Arrays;

public class A8_kthLargest {
    public static int kthLargest(int arr[], int low, int high, int k) {
        int part = partition(arr, low, high);
        if (part == k-1)
            return arr[part+1]; 

        else if (part < k - 1) {
            return kthLargest(arr, part + 1, high, k);
        }
        else return kthLargest(arr, low, part - 1, k);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotloc = low;
        int pivot = arr[high];

        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotloc);
                pivotloc++;
            }
        }

        swap(arr, pivotloc, high);
        return pivotloc;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 4, 5, 8, 16, 11, 26};


        int kPosition = 3;
        int length = arr.length;

        if (kPosition > length) {
            System.out.println("Index out of bound");
        } else {
            // find kth smallest value
            System.out.println(
                    "K-th largest element in array : "
                            + kthLargest(arr, 0, length - 1,
                            kPosition));
        }

    }
}
