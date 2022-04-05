import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findUpperLowerBoundTest {

    @Test
    void NonDupArr() {
        findUpperLowerBound solution = new findUpperLowerBound();
        int[] nums = {1, 2, 3};
        int target = 2;
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{1, 1}, result);
    }

    @Test
    void singleArr() {
        findUpperLowerBound solution = new findUpperLowerBound();
        int[] nums = {1};
        int target = 1;
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    void NonExistentSmallerNum() {
        findUpperLowerBound solution = new findUpperLowerBound();
        int[] nums = {1, 2, 2, 2, 3};
        int target = 0;
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void NonExistentBiggerNum() {
        findUpperLowerBound solution = new findUpperLowerBound();
        int[] nums = {1, 2, 2, 2, 3};
        int target = 5;
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void ExistingDupNum() {
        findUpperLowerBound solution = new findUpperLowerBound();
        int[] nums = {1, 2, 2, 2, 3};
        int target = 2;
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void AllDupNum() {
        findUpperLowerBound solution = new findUpperLowerBound();
        int[] nums = {2, 2, 2, 2, 2};
        int target = 2;
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{0, 4}, result);
    }

}