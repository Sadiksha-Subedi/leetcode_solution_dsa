class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (mpp.containsKey(diff)){
                return new int[] {i, mpp.get(diff)};
            }

            else {
                mpp.put(nums[i], i);
            }
        }
        return null;
    }
}