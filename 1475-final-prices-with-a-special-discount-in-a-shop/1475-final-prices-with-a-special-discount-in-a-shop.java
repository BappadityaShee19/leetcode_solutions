class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = prices.clone();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<n; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int pi = stack.pop();
                result[pi]-= prices[i];
            }
            stack.push(i);
        }
        return result;
    }
}