class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int majorityEl= 0;

        for (int i = 0; i < nums.length; i++){
            if (count == 0){
                majorityEl = nums[i];
                count++;
                continue;
            }
            if (nums[i]== majorityEl) count++;
            else if (nums[i]!= majorityEl)count--;
        }
        return majorityEl;

    }
}