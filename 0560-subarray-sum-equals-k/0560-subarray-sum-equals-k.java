class Solution {
    public int subarraySum(int[] nums, int k) {
        int l =nums.length;
        int[] sumArray = new int[l+1];
        for(int i=1; i<= l; i++){
            sumArray[i] = sumArray[i-1]+nums[i-1];
        }
        int count =0;
        for(int start=0; start<l; start++){
            for(int end = start+1; end<=l; end++){
                if(sumArray[end]-sumArray[start]==k){
                    count++;
                }
            }
        }
        return count;
    }
}