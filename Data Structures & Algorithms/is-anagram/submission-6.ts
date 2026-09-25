class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        let anagramValidator = new Int32Array(26);

        if (s.length != t.length) {
            return false;
        }

        for (var index = 0; index < s.length; ++index) {
            anagramValidator[s.charCodeAt(index) - 97]++;
            anagramValidator[t.charCodeAt(index) - 97]--;
        }

        for (var index = 0; index < 26; ++index) {
            if (anagramValidator.at(index) != 0) {
                return false;
            }
        }

        return true;
    }
}
