class Solution {
    public void sortColors(int[] nums) {
        int[] colorsCount = new int[3];

        for (int i = 0; i < nums.length; ++i) {
            colorsCount[nums[i]]++;
        }

        int index = 0; 

        for (int i = 0; i < 3; ++i) {
            while (colorsCount[i] > 0) {
                nums[index] = i;
                index++;
                colorsCount[i]--;
            }
        }
    }
}