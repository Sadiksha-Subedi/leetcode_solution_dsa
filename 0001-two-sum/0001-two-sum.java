class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> mpp = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (mpp.containsKey(diff)){
                result [0]= i;
                result [1] = mpp.get(diff);
                return result;
            }
            else {
                mpp.put(nums[i], i);
            }
        }
        return null;
    }
}