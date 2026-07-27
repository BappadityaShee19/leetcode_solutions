class Solution {
    public int dominantIndex(int[] nums) {
        //Arrays.sort(nums);
        int max = Arrays.stream(nums).max().getAsInt();
        int c =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == max){
                c+=i;
            }
        }
        Arrays.sort(nums);
        int n = nums.length;
        if(max >=nums[n-2]*2){
            return c;
        }
        else{
            return -1;
        }

    }
}