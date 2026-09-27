class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circularSandwiches = 0;
        int squareSandwiches = 0;

        for (int i = 0; i < students.length; ++i) {
            if (students[i] == 1) {
                squareSandwiches++;
            } else {
                circularSandwiches++;
            }
        }

        for (int i = 0; i < sandwiches.length; ++i) {
            if (sandwiches[i] == 1 && squareSandwiches > 0) {
                squareSandwiches--;
            } else if (sandwiches[i] == 0 && circularSandwiches > 0) {
                circularSandwiches--;
            } else if ((sandwiches[i] == 1 && squareSandwiches == 0)
                || (sandwiches[i] == 0 && circularSandwiches == 0)) {
                break;
            }
        }

        return circularSandwiches + squareSandwiches;
    }
}