class Solution {

    ArrayList <Integer> generateRow(int rows) {
            ArrayList <Integer> temp = new ArrayList<>();
            long  ans = 1;
            temp.add((int)ans);
            for(int cols = 1; cols < rows ;cols++){
                ans *= rows - cols;
                ans /= cols;
                temp.add((int)ans);
            }
        return temp;
        }

    public List<List<Integer>> generate(int numRows) {
        List <List <Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i ++){
            res.add(generateRow(i+1));
        }
        return res;
    }
}