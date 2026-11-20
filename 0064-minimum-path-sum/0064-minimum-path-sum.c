int min(int a, int b) {
    return (a < b) ? a : b;
}
int minPathSum(int** grid, int gridSize, int* gridColSize) {
    for (int i=0; i<gridSize; i++) {
        for (int x=0; x<*gridColSize; x++) {
            if (i > 0 && x > 0) {
                grid[i][x] += min(grid[i-1][x], grid[i][x-1]);
            } else if (i > 0) {
                grid[i][x] += grid[i-1][x];
            } else if (x > 0) {
                grid[i][x] += grid[i][x-1];
            }
        }
    }
    return grid[gridSize-1][*gridColSize-1];
}