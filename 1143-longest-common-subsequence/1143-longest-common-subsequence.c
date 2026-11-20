int max(int a, int b) {
    return (a > b) ? a : b;
}

int longestCommonSubsequence(char* text1, char* text2) {
    int m=strlen(text1);
    int n= strlen(text2);
        int dp[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<n+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
               if(text1[i-1]==text2[j-1]){
                  dp[i][j]= 1+dp[i-1][j-1];
               }else{
                   dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
               } 
            }
        }
        return dp[m][n];
    }
    
