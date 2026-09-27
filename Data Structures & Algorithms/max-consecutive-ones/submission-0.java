class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                currentMax++;
            } else {
                if (currentMax != 0 && currentMax > max) {
                    max = currentMax;
                }
                currentMax = 0;
            }
        }

        if (currentMax > max) {
            max = currentMax;
        }

        return max;
    }
}