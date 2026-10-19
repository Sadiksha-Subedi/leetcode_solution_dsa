class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List <Integer>> res = new ArrayList <>();
// -1,0,1,2,-1,-4
// -1,-1,0,1,2,-4
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2 ; i++){
            int j = i+1;
            int k = nums.length-1;
            if (i > 0 && nums[i] == nums[i-1]) continue; //checking dups for i 

            while (j< k ){
                int total = nums[i]+ nums[j]+ nums[k];
                if (total > 0){
                    k--;
                    continue;
                }
                else if (total < 0){
                    j++;
                    continue;
                }
                else {        //the total is equal to 0
                    ArrayList <Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j]== nums[j-1]) j++;  //checking dups for j 
                    while (k > j && nums[k] == nums[k+1]) k--; //checking dups for k
                }
                
            }

        }
        return res;
        
    }
}

//12010000
//00000112