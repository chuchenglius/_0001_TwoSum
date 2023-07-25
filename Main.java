import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        System.out.print(Arrays.toString(solution.twoSum(nums,target)));
    }
}
