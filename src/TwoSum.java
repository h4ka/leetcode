public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        boolean isFound = false;
        int a = 0;
        int[] result = new int[2];

        while(!isFound){

            for(int i = a + 1; i <= nums.length - 1; i++) {

                if ((nums[a] + nums[i]) == target) {

                    result[0] = a;
                    result[1] = i;
                    isFound = true;
                    break;

                }
            }

            if (a == nums.length - 1 ){
                break;
            }
            a++;
        }
        return result;
    }

}
