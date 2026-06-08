package arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int bestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            bestProfit = Math.max(bestProfit, currentPrice - minPrice);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return bestProfit;
    }
}
