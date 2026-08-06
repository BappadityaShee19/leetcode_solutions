class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length-1; i++){
            for( int m= nums[i]+1; m< nums[i+1]; m++){
                ls.add(m);
            }
        }
        return ls;
    }
}