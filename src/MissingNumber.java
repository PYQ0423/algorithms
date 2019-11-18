import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 14:30
 **/

public class MissingNumber {
    /**
     * Function Description
     * <p>
     * Complete the missingNumbers function in the editor below.
     * It should return a sorted array of missing numbers.
     * <p>
     * missingNumbers has the following parameter(s):
     * <p>
     * arr: the array with missing numbers
     * brr: the original array of numbers
     * <p>
     * Input Format
     * <p>
     * There will be four lines of input:
     * n - the size of the first list,
     * The next line contains n space-separated integers arr[i]
     * m - the size of the second list,
     * The next line contains m space-separated integers brr[i]
     * <p>
     * Output Format
     * Output the missing numbers in ascending order.
     * <p>
     * Sample Input
     * 10
     * 203 204 205 206 207 208 203 204 205 206
     * 13
     * 203 204 204 205 206 207 205 208 203 206 205 206 204
     * <p>
     * Sample Output
     * 204 205 206
     * <p>
     * Explanation
     * 204 is present in both arrays. Its frequency in arr is 2 ,
     * while its frequency in brr is 3 . Similarly,
     * 205 and 206 occur twice in arr , but three times in brr .
     * The rest of the numbers have the same frequencies in both lists.
     */
    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        // sort it first
        Arrays.sort(arr);
        Arrays.sort(brr);

        ArrayList<Integer> result = new ArrayList<>();
        // if the amount or the num is different, add to result;
        int indA = 0, indB = 0;
        while (indA < arr.length || indB < brr.length) {
            if (arr[indA] == brr[indB]) { // if equals
                indA++;
            } else
                result.add(brr[indB]) ;
            indB++;
        }
        return result.stream().mapToInt(i -> i).toArray();  // This is interesting.
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); // This scanner shall be used again.
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(missingNumbers(arr, brr)));

    }
}



