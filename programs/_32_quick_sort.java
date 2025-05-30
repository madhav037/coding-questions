// WAP to sort an Array using Quick sort.

public class _32_quick_sort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        // swap pivot
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;

        return i + 1;
    }
}
