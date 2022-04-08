import dataStructure.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

//https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
class TwoSumTest {
    @Test
    void differentNum() {
        TwoSum solution = new TwoSum();
        int[] arr = {5, 3, 2, 7, 8};
        int target = 10;

        int[] expectedResult = {1, 3};
        int[] actualResult = solution.twoSum(arr, target);
        Arrays.sort(actualResult);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void sameNum() {
        TwoSum solution = new TwoSum();
        int[] arr = {5, 3, 3, 7, 8};
        int target = 6;

        int[] expectedResult = {1, 2};
        int[] actualResult = solution.twoSum(arr, target);
        Arrays.sort(actualResult);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void solutionTest() {
        SolutionTwoSum solution = new SolutionTwoSum();
        int[] arr = {5, 3, 3, 7, 8};
        int target = 10;

        int[] expectedResult = {1, 2};
        int[] actualResult = solution.twoSum(arr, target);
        Arrays.sort(actualResult);
        assertArrayEquals(expectedResult, actualResult);
    }


}