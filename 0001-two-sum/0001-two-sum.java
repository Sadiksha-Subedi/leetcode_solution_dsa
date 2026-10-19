class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                ans[0] = map.get(target - arr[i]);
                ans[1] = i;
                return ans;
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }
}