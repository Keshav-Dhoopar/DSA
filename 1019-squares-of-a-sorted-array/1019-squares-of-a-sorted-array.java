class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int a = 0, b = n - 1, c = n - 1;
        
        while (a <= b) {
            int d = nums[a] * nums[a];
            int e = nums[b] * nums[b];
            if (d > e) {
                result[c] = d;
                a++;
            } else {
                result[c] = e;
                b--;
            }
            c--;
        }
        
        return result;
    }
}