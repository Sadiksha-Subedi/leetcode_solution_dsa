class Solution {
    public int maxSubArray(int[] nums) {
        long sum = 0;
        long maxSum = -100000;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > maxSum )maxSum = sum;
            if (sum <= 0) sum= 0;
        }
        return (int) maxSum;
        
        
    }
}