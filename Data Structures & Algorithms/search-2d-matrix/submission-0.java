class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            boolean exists = contains(arr, target);
            if (exists) {
                return exists;
            }
        }

        return false;
    }

    private boolean contains(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;

        while (i <= j) {
            int middle = (i + j) / 2;

            if (array[middle] < target) {
                i = middle + 1;
            } else if (array[middle] > target) {
                j = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    } 
}
