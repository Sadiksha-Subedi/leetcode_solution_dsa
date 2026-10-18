class Solution {
    public void rotate(int[][] matrix) {

        //intuition: find the transpose and swaps the cols

        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int left = 0;
            int right = n-1;
            while (right > left){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
      
        
    }
}