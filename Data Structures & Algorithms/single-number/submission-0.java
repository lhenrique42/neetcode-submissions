class Solution {
    public int singleNumber(int[] nums) {
        int current = nums[0];

        for (int index = 1; index < nums.length; ++index) {
            current = current ^ nums[index];
        }

        return current;
    }
}
