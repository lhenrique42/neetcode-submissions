class Solution {
    public int[] replaceElements(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; ++i) {
            arr[i] = findBiggest(arr, i + 1);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public int findBiggest(int[] arr, int startIndex) {
        int biggest = arr[startIndex];
        for (int i = startIndex; i < arr.length; ++i) {
            biggest = Math.max(biggest, arr[i]);
        }

        return biggest;
    }
}