import java.util.Scanner;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 13:47
 **/
// DON'T understand the meaning.
/**
 * Sample Input
 *
 * 5
 * 2 4 6 8 3
 *
 *
 * Sample Output
 *
 * 2 4 6 8 8
 * 2 4 6 6 8
 * 2 4 4 6 8
 * 2 3 4 6 8
 *
 *
 * Explanation
 *
 * 3 is removed from the end of the array.
 * In the 1st line 8 > 3, so 8 is shifted one cell to the right.
 * In the 2nd line 6 > 3, so 6 is shifted one cell to the right.
 * In the 3rd line 4 > 3 , so 4 is shifted one cell to the right.
 * In the 4th line 2 < 3, so 3 is placed at position .
 *
 */
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








