class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        const stack: string[] = [];
        const chars: Record<string, string> = {
            ']': '[',
            '}': '{',
            ')': "("
        }


        for (let i = 0; i < s.length; ++i) {

            if (s.charAt(i) in chars) {
                let char = stack.pop();

                if (chars[s.charAt(i)] != char) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.length === 0;
    }
}
