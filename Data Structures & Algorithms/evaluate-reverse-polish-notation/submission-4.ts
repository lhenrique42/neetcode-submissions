class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens: string[]): number {
        let stack: number[] = [];

        for (let tk of tokens) {
            
            if (tk === "+" || tk === "-" || tk === "*" || tk === "/") {
                let val2 = stack.pop();
                let val1 = stack.pop();

                if (tk === "+") {
                    stack.push(val1 + val2);
                } else if (tk === "-") {
                    stack.push(val1 - val2);
                } else if (tk === "*") {
                    stack.push(val1 * val2);
                } else if (tk === "/") {
                    stack.push(Math.trunc(val1 / val2));
                } 
            } else {
                stack.push(Number(tk));
            }
        }

        return stack.pop();
    }
}
