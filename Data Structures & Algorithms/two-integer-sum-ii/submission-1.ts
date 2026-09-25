class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers: number[], target: number): number[] {
        for (let i = 0, j = numbers.length - 1; ;) {
            if (numbers[i] + numbers[j] > target) {
                --j;
                continue;
            } else if (numbers[i] + numbers[j] < target) {
                ++i;
            } else if(numbers[i] + numbers[j] == target) {
                return [i + 1, j + 1];
            }
        } 
    }
}
