class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expected = n * (n+1)/2;
        int actual =0;
        int unique =0;
        Set<Integer> seen = new HashSet<>();
        for(int num: nums){
            actual += num;
            if(seen.add(num)){
                unique += num;
            }
        }
        int dupi = actual - unique;
        int missing = expected - unique;
        return new int[]{dupi, missing};
    }
}