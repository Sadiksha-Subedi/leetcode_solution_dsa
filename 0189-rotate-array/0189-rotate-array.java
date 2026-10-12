class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k%n ; //to make k smaller than n
        int d = n- k;
        
        int[] rotate = new int[nums.length];

        for (int i = 0; i < n;  i++){
            
            rotate [i] = nums[d % n];
            d++;
            
        }
        System.arraycopy(rotate, 0, nums, 0, rotate.length);
        
    }
}