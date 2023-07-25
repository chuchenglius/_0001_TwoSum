public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 1;
        boolean finish = false;
        while (finish != true) {
            if (nums[index2] == target - nums[index1]) {
                finish = true;
            } else {
                index2++;
                if (index2 == nums.length) {
                    index1++;
                    index2 = index1 + 1;
                }
            }
        }
        return new int[]{index1, index2};
    }
}
