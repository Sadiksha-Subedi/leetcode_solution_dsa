class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int[] pos = new int [n/2];
        int[] neg = new int [n/2];
      

        int pi = 0, ni=0;
        for (int i = 0; i < n ;i++){
            if(nums[i]>= 0 ){
                pos[pi++]= nums[i];
            }
            else {
                neg[ni++] = nums[i];
            }
        }

        pi=0;ni=0;
        for (int i = 0; i < n; i++){
            if (i%2 == 0){
                result[i] = pos[pi++];
            }
            else {
                result[i] = neg[ni++];
        }
       }
       return result;
        
    }
}