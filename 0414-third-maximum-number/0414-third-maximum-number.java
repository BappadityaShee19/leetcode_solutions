import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int distinct = 1;
        int third = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinct++;
                third = nums[i];
            }

            if (distinct == 3) {
                return third;
            }
        }

        // Less than 3 distinct numbers
        return nums[nums.length - 1];
    }
}