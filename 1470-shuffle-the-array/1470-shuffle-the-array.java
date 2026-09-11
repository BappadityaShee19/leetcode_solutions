class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length == 2*n){
            int[] nums2=new int[nums.length];
            int k=0;
            for(int i=0, j=n; i<n && j<nums.length; i++,j++){
                
                nums2[k]=nums[i];
                k++;
                nums2[k]=nums[j];
                k++;
            }
            return nums2;
        }
        return nums;
    }
}