package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    void computesProductsForTypicalCase() {
        assertArrayEquals(new int[] { 24, 12, 8, 6 }, solution.productExceptSelf(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void handlesSingleElementInput() {
        assertArrayEquals(new int[] { 1 }, solution.productExceptSelf(new int[] { 5 }));
    }

    @Test
    void handlesZeroValues() {
        assertArrayEquals(new int[] { 6, 0, 0, 0 }, solution.productExceptSelf(new int[] { 0, 1, 2, 3 }));
    }
}
