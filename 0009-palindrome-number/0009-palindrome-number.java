class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y =x;
        int z = 0;
        while(x!=0){
            int temp = x%10;
            z=z*10+temp;
            x=x/10;
        }
        return (y==z);
    }
}