class Solution {
    public void setZeroes(int[][] matrix) {
       int col0 = 1; 

       for (int i = 0 ; i < matrix.length; i++){
        for (int j = 0; j < matrix[i].length; j++){
            if (matrix[i][j] == 0){
                matrix[i][0] = 0;
                if (j != 0){
                    matrix [0][j] = 0;
                }
                else {
                    col0 = 0; //disclaimer!
                }
            }
        }
       }

       for (int i = 1 ; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length; j++){
                if (matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix [0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
       }
        if (matrix[0][0] == 0){
        for (int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }

       }

       if (col0 == 0){
            for (int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
       }

      

    }
}

/*

Step1 :

1.  0th col [i] [0] acts as a indicator to tells us if the specific rows should be changed to be zero 
2.  0th row [0] [j] acts as an indicator to tells us if the specific cols should be changed to zero
3.  ONE THING TO KEEP IN MIND if col 0th needs to be zero we introduce a new placeholder col0 because matrix[0][0] will 
    tell us if 0th row  should be zero. col0 will be initialized to 1 at first. 
4.  We iterate through each element from i = 0 to j = 0 and if we found a '0' we make [i][0] = 0 and [0][j] = 0.
    This will tell us later that the specific row and col should be changed to 0.
5.  If there is '0' on matrix[i][0], then we need to make the entire 0th col = 0, for that we need to change the indicator col0 = 0.

Step 2: 
1. Now, that we know what rows and cols should be zero, we iterate once again through the loop to make the rows and cols 0's.
2. Iteration starts from i = 1 to j = 1 as i =0 and j= 0, are holding the place holders and we dont want to mess with that.
3. While iterating if we find a 'NON - ZERO' number then we check if either matrix[i] [0] is  0  or matrix[0] [j] = 0.
   If either of those are 0 then we need to change the element that is non-zero to zero.
4. If we find a zero, dont worry about it we've already added an indicator, and thats all. In further iteration all 
    non-zero elements will be automatically changed to zero if necessary. Thats how we've written the program to work.
    So, dont worry if we see a 0.
5. Don't worry about the col0 for now, j starts with 1 so, we're not touching the 0th col, we'll check that after this loop is done.
6. Now we've changed all the necessary elements to 0

Step 3:
1. We still have one thing left
2. We still haven't checked if we should make entire col0 to be 0's
3. We didn't do it earlier because it'd have messed with our indicator on the 0th col.
4. Now that everythings done, we check if the col0 == 0 or not.
5. If it is change the entire col to 0 (matrix[i][0] == 0) (i goes from 0 to matrix.length) (top to bottom 0th col becomes 0).
6. That's it. Its a lot to grab but its easy once you get the concepts

Additional notes: just be careful about the col0 placeholder, when to change it in Step:1 , other than that eveything just goes with the flow

*/