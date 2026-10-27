class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] table = new int[n];
        table[0] = nums[0];
        table[1] = nums[1];
        table[2] = nums[0] + nums[2];
        for (int i = 3; i < n; i++) {
            table[i] = Math.max(table[i - 2], table[i - 3]) + nums[i];
        }
        return Math.max(table[n - 1], table[n - 2]);
    }
}