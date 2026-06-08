package hashmaphashset;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void findsPairUsingHashMap() {
        assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }

    @Test
    void handlesDuplicateValues() {
        assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));
    }
}
