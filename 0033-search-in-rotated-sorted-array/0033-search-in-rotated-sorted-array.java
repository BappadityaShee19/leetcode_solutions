class Solution {
    public int search(int[] nums, int target) {
        int out = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]== target){
                out = i;
                return out;
            }
        }
        return -1;
    }
}