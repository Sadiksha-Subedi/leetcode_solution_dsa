class Solution {
    public List<Integer> getRow(int rowIndex) {
        int row = rowIndex+1;        //indexing starts from 1 for convenience
        List<Integer> res = new ArrayList<>();
        long ans = 1;
        res.add((int)ans); //ans is a long , change it to int datatype

        for (int col = 1; col < row; col++){ //col 0 has 1
            ans *= row - col;
            ans /= col;
            res.add((int)ans);        //make sure to change the ans from long to int
        }

        return res;
    }
}