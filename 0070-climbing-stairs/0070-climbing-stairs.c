
int solveMemo(int n, int* memo) {
    if (n <= 1) {
        return 1;
    }
    if (memo[n] != 0) {
        return memo[n];
    }
    memo[n] = solveMemo(n - 1, memo) + solveMemo(n - 2, memo);
    return memo[n];
}


int climbStairs(int n) {
        int* memo = (int*)calloc(n + 1, sizeof(int));
    int result = solveMemo(n, memo);
    free(memo);
    return result;
    
}