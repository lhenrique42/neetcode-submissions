class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums: number[], target: number): number {

        for (let i = 0, j = nums.length - 1; i <= j; ++i, --j) {
            if (nums[i] === target) {
                return i;
            }
            if (nums[j] == target) {
                return j;
            }
        }

        return -1;
    }
}
