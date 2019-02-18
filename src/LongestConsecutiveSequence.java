import java.util.Arrays;

public class LongestConsecutiveSequence {


    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int length = 1;
        int maxLength = 1;
        Integer prevInt = null;

        for (int i : nums){
            if (prevInt != null){
                if (i - prevInt == 1){
                    length++;
                    if (length > maxLength) maxLength = length;
                } else if (i - prevInt != 0){
                    length = 1;
                }
            }
            prevInt = i;
        }

        return maxLength;
    }
}
