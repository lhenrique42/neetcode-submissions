class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        const stack: string[] = [];

        for (let i = 0; i < s.length; ++i) {

            if (s.charAt(i) === ']') {
                let last = stack.pop();

                if (last != '[') {
                    return false;
                }
            } else if (s.charAt(i) === ')') {
                let last = stack.pop();

                if (last != '(') {
                    return false;
                }
            } else if (s.charAt(i) === '}') {
                let last = stack.pop();

                if (last != '{') {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return !(stack.length != 0);
    }
}
