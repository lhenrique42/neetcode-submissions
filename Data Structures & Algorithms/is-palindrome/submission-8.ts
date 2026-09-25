class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s: string): boolean {
        let normalized = s.toLocaleLowerCase()
                            .replace(/[^a-z0-9]/g, "");

        let i: number = 0;
        let j: number = normalized.length - 1;

        while (i < j) {
            if (normalized[i] != normalized[j]) {
                return false;
            }
            ++i;
            --j;
        }

        return true;
    }
}
