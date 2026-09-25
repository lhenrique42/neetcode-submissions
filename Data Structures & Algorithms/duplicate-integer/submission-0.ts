class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        let duplicateMap: Map<number, number> = new Map();

        for (var value of nums) {
            if (duplicateMap.has(value)) {
                duplicateMap.set(value, duplicateMap.get(value) + 1);
                continue;
            }
            duplicateMap.set(value, 1);
        }
        
        let result: boolean = false;
        duplicateMap.forEach((value, key) => {
            if (value > 1) {
                result = true;
            }
        });

        return result;
    }
}
