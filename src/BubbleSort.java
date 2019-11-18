/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 11:49
 **/

public class BubbleSort {
    // did not quite get it.
    public static void bubblesort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    if (array[i] > array[i + 1]) {
                        swap(array, i, i + 1);
                        isSorted = false;
                    }
                }
                lastUnsorted--;
            }
        }
    }

    public static void bubblesort1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

