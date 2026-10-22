class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        Arrays.fill(result, 1);

        int curr = 1;

        for (int i = 0; i < nums.length; i ++){
            result[i] *= curr;           //cuurent holds the product from left side, and we add that to result array, line: 10
            curr *= nums[i];             //so result array holds the suffix sum, line 9
        }

        curr = 1;

        for (int i = nums.length-1; i >= 0; i--){
            result[i]*=curr;              //current holds product from right side, result holds product from left side, line: 17
            curr *= nums[i];              //their product is stored in resulting array line :16
        }

        return result;
    }
}