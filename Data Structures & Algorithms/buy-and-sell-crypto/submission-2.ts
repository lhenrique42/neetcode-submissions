class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices: number[]): number {
        let profit: number = 0;
        let minPrice: number = prices[0];

        for (let i = 1; i < prices.length; ++i) {
            if ((prices[i] - minPrice) > profit) {
                profit = prices[i] - minPrice;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return profit;
    }
}
