class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;
        int min = Math.min(nums[0], Math.min(nums[1], nums[2]));
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        for (int i = 0; i < 3; i++) {
            if (nums[i] != min && nums[i] != max) {
                return nums[i];
            }
        }
        return -1;
    }
}