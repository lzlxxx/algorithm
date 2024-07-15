//快速排序
public class Practice_one {
    public static int partition(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while ((low < high) && (arr[high] >= key)) {
                high--;
            }
            if (low < high) {
                arr[low] = arr[high];
                low++;
            }
            while ((low < high) && (arr[low] <= key)) {
                low++;
            }
            if (low < high) {
                arr[high] = arr[low];
                high--;
            }
        }
        arr[low] = key;
        return low;
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int k = partition(arr, low, high);
            QuickSort(arr, low, k - 1);
            QuickSort(arr, k + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 8, 7, 4};
        QuickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
