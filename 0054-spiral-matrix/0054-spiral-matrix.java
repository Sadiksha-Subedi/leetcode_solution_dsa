class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = cols -1;
        int top = 0;
        int bottom = rows-1;

        while (left <= right && top <= bottom){
            for (int i = left; i <=right; i++){
                res.add(matrix[top][i]);
            }
            top++;                                //top is added

            for (int i = top; i <= bottom; i++){   //top <= bottom checked
                res.add(matrix[i][right]);
            }
            right--;                               //right is decremented

                                                   // at this point both right and top are incremented

            if (top <= bottom){                     //we have to check top/bottom cause we just increment top
            for (int i = right; i >= left; i--){    //loop automatically checks for right>=left
                res.add(matrix[bottom][i]);
            }
            bottom --;
            }

            if(left <= right ){                    // the loop checks for top<=bottom , we manually check for left <= right
 
            for (int i = bottom; i >= top; i--){
                res.add(matrix[i][left]);
            }
            left++;
            }

        }
        return res;
    }
        
}