class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++){           //for 3 sum its < nums.length -2
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1 ; j < nums.length -2; j++){    
                if (j > i+1 && nums[j] == nums[j-1]) continue;  
                int k = j+1;
                int l = nums.length-1;

                while (l > k){
                    long total = (long) nums[i]+ nums[j]+ nums[k]+ nums[l];   //taking care of the overflow
                    if  (total > target){
                        l--;
                    }
                    else if (total < target){
                        k++;
                    }
                    else {
                        ArrayList <Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        res.add(list);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1]) k++;
                        while (k < l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }
        return res;
    }
}

/*
In line 9, i and j can be equal if i and j are consecutive so we don't check "if equal" case, we only check once j is two step away from i.
eg : [-2,-1,-1,1,1,2,2], target = 0;
When i = -1, j = -1, k = 1, l = 2, i and j can be equal and its a valid list. If we do nums[j]==nums[j-1] like we did on 3 sum, then we will be erroneously saying "ok skip when j and i are equal." We only start checking for j once its 2 steps away from i.
*/