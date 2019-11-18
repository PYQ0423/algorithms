import java.util.Scanner;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 13:47
 **/


public class InsertionSort {



















    /* Head ends here */

    static void insertionSort(int[] ar) {
        int val = ar[ar.length - 1];
        int i = ar.length - 1;

        while (i > 0) {
            if (ar[i - 1] > val) {
                ar[i] = ar[i - 1];
                printArray(ar);
            } else {
                ar[i] = val;
                break;
            }
            i--;
        }
        if (i == 0 && ar[i] > val) {
            ar[i] = val;
        }
        printArray(ar);
    }

    /* Tail starts here */

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        insertionSort(ar);
    }


}








