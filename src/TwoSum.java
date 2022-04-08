import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexResult = new int[]{-1, -1};
        HashMap<Integer, ArrayList> numIndexMap = new HashMap();
        ArrayList<Integer> indexList;
        for (int i = 0; i < nums.length; i++) {

            if (numIndexMap.containsKey(nums[i])) {
                indexList = numIndexMap.get(nums[i]);
            } else {
                indexList = new ArrayList<>();
            }
            indexList.add(i);
            numIndexMap.put(nums[i], indexList);
        }
        for (int i = 0; i < nums.length; i++) {
            int leftNum = target - nums[i];
            indexList = numIndexMap.get(leftNum);
            if (numIndexMap.containsKey(leftNum) && indexList.get(0)!= i) {
                indexResult[0] = i;
                if (numIndexMap.get(leftNum).size() > 1 && (int) numIndexMap.get(leftNum).get(0) == i) {
                    indexResult[1] = (int) numIndexMap.get(leftNum).get(1);
                } else {
                    indexResult[1] = (int) numIndexMap.get(leftNum).get(0);
                }
            }
            if (indexResult[0] != -1 && indexResult[1] != -1) {
                break;
            }
        }
        return indexResult;
    }
}

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}

