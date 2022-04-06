
//34. 在排序数组中查找元素的第一个和最后一个位置
public class findUpperLowerBound {
    public int[] searchRange(int[] nums, int target) {
        int lowerBound = -1, upperBound = -1;
        int start = 0, end = nums.length - 1, mid = (start + end) / 2;
        while (start <= end) {
            if (nums[mid] < target) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else if (nums[mid] >= target) {
                end = mid - 1;
                if (nums[mid] == target) {
                    lowerBound = mid;
                }
                mid = (start + end) / 2;
            }
        }

        start = 0;
        end = nums.length - 1;
        mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] <= target) {
                start = mid + 1;
                if (nums[mid] == target) {
                    upperBound = mid;
                }
                mid = (start + end) / 2;
            } else if (nums[mid] > target) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }

        return new int[]{lowerBound, upperBound};
    }
}


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
