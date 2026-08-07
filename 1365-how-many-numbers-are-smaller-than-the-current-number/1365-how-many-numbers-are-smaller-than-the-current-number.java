class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] num2 = new int[n];
        for(int i=0; i<n; i++){
            int count =0;
            for(int j = 0; j<n; j++){
                //Arrays.sort(nums);
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            num2[i] = count;
        }
        return num2;
    }
}