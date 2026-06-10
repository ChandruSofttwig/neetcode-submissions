class Solution {
    public int maxProfit(int[] prices) {
        int l =0;
        int r = prices.length-1;
        int minprice = prices[0];
        int max = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            minprice = Math.min(prices[i],minprice);
            profit = prices[i]-minprice;
            max = Math.max(max,profit);
        }
        return max;
    }
}
