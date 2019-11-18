import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 13:23
 **/


public class SelectionSort {


    // Complete the insertionSort1 function below.
    static void selectionSort(int n, int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int min_ind = i;  // from small to big
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            swap(arr, i, min_ind);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[j] = temp;
        arr[i] = arr[j];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        selectionSort(n, arr);

        scanner.close();
    }
}

