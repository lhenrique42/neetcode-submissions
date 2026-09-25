class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        let anagramValidator: Map<String, number> = new Map();

        if (s.length != t.length) {
            return false;
        }

        for (var char of s) {
            anagramValidator.set(char, (anagramValidator.get(char) || 0) + 1);
        }
        for (var char of t) {
            if (!anagramValidator.get(char)) {
                return false;
            }
            anagramValidator.set(char, anagramValidator.get(char) - 1);
        }


        return true;
    }
}
