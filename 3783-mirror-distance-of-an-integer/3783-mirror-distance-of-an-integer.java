class Solution {
    public int mirrorDistance(int n) {
        int x = n;
        int m =0;
        while(x!=0){
            int temp = x%10;
            m=m*10+temp;
            x =x/10;
        }
        return Math.abs(m-n);
    }
}