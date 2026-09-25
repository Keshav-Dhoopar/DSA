class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            a[i] = nums[i + 1];
            a[i+1] = nums[i];
    }
    return a;
}
}