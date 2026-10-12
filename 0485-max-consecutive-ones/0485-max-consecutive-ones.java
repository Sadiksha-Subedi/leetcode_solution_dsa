class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) count++;
            else count = 0;
            maxCount = (count > maxCount ) ? count : maxCount;
        }
        return maxCount;
    }
}