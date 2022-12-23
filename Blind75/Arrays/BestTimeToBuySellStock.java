class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int max_profit = 0;

        //if-else-if ensures only one of `lowest` 
        //and `max_profit` updates in 1 iteration
        //lowest always one the left of i when updating max_profit
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowest) lowest = prices[i];
            else if (prices[i] - lowest > max_profit)
                max_profit = prices[i] - lowest;
        }

        return max_profit;
    }
}