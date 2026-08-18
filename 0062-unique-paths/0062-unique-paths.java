class Solution {
    public int uniquePaths(int m, int n) {
        int l = m + n -2;
        long sum1 =1;
        int k = Math.min(m-1, n-1);

        for(int i=1; i<=k; i++){
            sum1 = sum1 * (l-k+i) / i;
        }
        return (int)sum1;
    }
}