package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    void returnsBestProfitForTypicalCase() {
        assertEquals(5, solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    void returnsZeroWhenPricesOnlyDecrease() {
        assertEquals(0, solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }

    @Test
    void returnsZeroForSinglePrice() {
        assertEquals(0, solution.maxProfit(new int[] { 5 }));
    }
}
