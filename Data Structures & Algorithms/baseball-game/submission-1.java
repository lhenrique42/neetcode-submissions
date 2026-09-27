class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scoreList = new Stack();

        for (int i = 0; i < operations.length; ++i) {

            if ("+".equals(operations[i])) {
                Integer value1 = scoreList.pop();
                Integer value2 = scoreList.pop();
                scoreList.push(value2);
                scoreList.push(value1);
                scoreList.push(value1 + value2);
            } else if ("D".equals(operations[i])) {
                Integer top = scoreList.peek();
                scoreList.push(top * 2);
            } else if ("C".equals(operations[i])) {
                scoreList.pop();
            } else {
                scoreList.push(Integer.valueOf(operations[i]));
            }
        }


        return scoreList.stream().mapToInt(Integer::intValue).sum();
    }
}