import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // Find and return indices of x and y from nums array where x + y == target

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int x = target - nums[i];
            if (map.containsKey(x)){
                return new int[] {map.get(x), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
