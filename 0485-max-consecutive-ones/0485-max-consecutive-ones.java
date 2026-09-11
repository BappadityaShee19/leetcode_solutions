class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0,j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                k=0;
            }
            else{
                k++;
                if(j<k){
                    j=k;
                }
            }
        }
        return j;
    }
}