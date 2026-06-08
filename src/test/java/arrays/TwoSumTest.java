package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void findsIndicesForBasicCase() {
        assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }

    @Test
    void findsPairWithDuplicates() {
        assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));
    }

    @Test
    void returnsEmptyArrayWhenNoSolutionExists() {
        assertEquals(0, solution.twoSum(new int[] { 1, 2, 3 }, 100).length);
    }
}
