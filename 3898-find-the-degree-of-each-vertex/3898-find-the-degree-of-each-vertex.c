/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDegrees(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int n = matrixSize;
    *returnSize = n;

    int* ans = (int*)malloc(n*sizeof(int));
    for(int i=0; i<n; i++){
        int degree =0;
        for(int j=0; j<n; j++){
            degree += matrix[i][j];
        }
        ans[i] = degree;
    }
    return ans;
}