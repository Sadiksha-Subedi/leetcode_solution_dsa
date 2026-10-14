class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];

        int posIndex= 0, negIndex = 1; //posindex takes even indices {0,2,4}
                                       //negative takes odd indices  {1,3,5}

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex +=2;
            }
            else{ 
                result[negIndex] = nums[i];
                negIndex +=2;
            }
        }
       return result;
    }
}