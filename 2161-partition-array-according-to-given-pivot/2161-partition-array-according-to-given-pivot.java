class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] nums2 = new int[n];
        int left =0; 
        int right = n-1;
        for(int i=0, j=n-1; i<n; i++, j--){
            if(nums[i]<pivot){
                nums2[left++] = nums[i];
            }
            if(nums[j] > pivot){
                nums2[right--] = nums[j];
            }
        }
        while(left <= right){
            nums2[left++] = pivot;
        }
        return nums2;
    }
}