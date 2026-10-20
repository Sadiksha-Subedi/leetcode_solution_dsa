class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        while (mid <= high){
            
            if (nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low]= temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 2){
                //swap high and mid 
                int temp = nums[mid];
                nums[mid]= nums[high];
                nums[high] = temp;
                high--;
            }
            else mid++;
        }
    }
}

/*
if mid is 0 left++ mid++ //left bata 0 ra 1 matra aaucha
if mid is 2 high-- //we still need to check for the value that comes from high
if mid is 1 // simply increase mid, cause that is what we need in mid




 */