package hashmaphashset;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void returnsMostFrequentElements() {
        int[] actual = solution.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
        Arrays.sort(actual);
        assertArrayEquals(new int[] { 1, 2 }, actual);
    }

    @Test
    void handlesNegativeNumbers() {
        int[] actual = solution.topKFrequent(new int[] { 4, 1, -1, 2, -1, 2, 3 }, 2);
        Arrays.sort(actual);
        assertArrayEquals(new int[] { -1, 2 }, actual);
    }

    @Test
    void returnsEmptyArrayForNonPositiveK() {
        assertArrayEquals(new int[] { }, solution.topKFrequent(new int[] { 1, 2, 3 }, 0));
    }
}
