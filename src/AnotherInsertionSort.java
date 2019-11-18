import java.util.Scanner;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 13:55
 **/

public class AnotherInsertionSort {


    /**
     * Sample Input
     *
     * 6
     * 1 4 3 5 6 2
     *
     *
     * Sample Output
     *
     * 1 4 3 5 6 2
     * 1 3 4 5 6 2
     * 1 3 4 5 6 2
     * 1 3 4 5 6 2
     * 1 2 3 4 5 6
     *
     *
     * Explanation
     *
     * Skip testing 1 against itself at position 0 . It is sorted.
     *
     * Test position 1 against position 0 : 4 > 1, no more to check, no change.
     * Print arr
     *
     * Test position 2 against positions 1 and 0 :
     *
     * 3 < 4, new position may be 1. Keep checking.
     * 3 > 1, so insert 3 at position 1 and move others to the right.
     * Print arr
     *
     * Test position 3 against positions 2,1,0 (as necessary): no change.
     * Print arr
     *
     * Test position 4 against positions 3,2,1,0 : no change.
     * Print arr
     *
     * Test position 5 against positions 4,3,2,1,0 , insert 2 at position 1 and move others to the right.
     * Print arr
     */



    public static void insertionSort(int[] ar) {
        int len = ar.length;
        for (int i = 1; i < len; i++) {
            int val = ar[i];
            int j = i;

            while (j > 0) {
                if (ar[j - 1] > val) {
                    ar[j] = ar[j - 1];
                } else {
                    ar[j] = val;
                    break;
                }
                j--;
            }
            if (j == 0 && ar[j] > val) ar[j] = val;
            printArray(ar);

        }
    }

    /* Tail starts here */
    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

}

