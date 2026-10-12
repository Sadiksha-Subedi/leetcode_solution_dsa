class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int left = 1;
        
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[left-1]){
                nums[left] = nums[i];
                count++;left++;
            }
        }

        return count;
        }
        
    }
