class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int size = nums.length;
        for (int i = 0; i < size; ++i) {
            ans[i] = nums[i];
            ans[i + size] = nums[i];
        }

        return ans;
    }
}