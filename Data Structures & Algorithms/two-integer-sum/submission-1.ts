class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        let numbersMap: Map<number, number> = new Map();
        let indexes: number[] = [];

        for (var i = 0; i < nums.length; ++i) {
            numbersMap.set(nums[i], i);
        }

        for (var i = 0; i < nums.length; ++i) {
            let missingPart = target - nums[i];
            
            if (numbersMap.has(missingPart)) {
                let j = numbersMap.get(missingPart);
                if (i === j) {
                    continue;
                }
                if (i > j) {
                    indexes.push(numbersMap.get(missingPart));
                    indexes.push(i);
                } else {
                    indexes.push(i);
                    indexes.push(numbersMap.get(missingPart));
                }
                break;
            }
        }

        return indexes;
    }
}
