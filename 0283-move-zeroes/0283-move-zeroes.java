class Solution {
    public void moveZeroes(int[] nums) {
        //if right = 0; right++
        //if right = 1 swap with left, left ++, right++;
        
        int left = 0;
       for (int right = 0; right < nums.length; right++){
            if (nums[right]!= 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;   
            }
        }
    }
}