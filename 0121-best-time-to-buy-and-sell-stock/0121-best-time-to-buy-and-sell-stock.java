class Solution {
    public int maxProfit(int[] prices) {
        int maxprice = Integer.MAX_VALUE;
        int profit =0;
        for(int p:prices){
            if(p<maxprice){
                maxprice = p;
            }
            else if(p-maxprice>profit){
                profit = p-maxprice;
            }
        }
        return profit;
    }
}