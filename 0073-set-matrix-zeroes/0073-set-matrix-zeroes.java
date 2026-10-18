class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        ArrayList <Integer> cols = new ArrayList<>();

        for (int i = 0; i < rows; i++){
            for (int j = 0 ; j < matrix[i].length ; j++){
                if (matrix[i][j] == 0){
                    int left = 0;
                    while (left < matrix[i].length){
                        if (matrix[i][left] == 0) {
                            cols.add(left);
                        }
                        else{
                        matrix[i][left] = 0;
                        }
                        left++;
                    }
                break;
                }
                
            }
        }

        for (int j = 0 ; j < matrix[0].length; j++){
            if (cols.contains(j)){
                int top = 0;
                while (top < matrix.length){
                    matrix[top][j] = 0;
                    top++;
                }
            }

        }
        return;
    }
}