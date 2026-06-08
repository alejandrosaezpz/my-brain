package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class FrequencyCounterTest {

    @Test
    void countsIntegers() {
        Map<Integer, Integer> counts = FrequencyCounter.countIntegers(new int[] { 1, 1, 2, 3, 3, 3 });

        assertEquals(Map.of(1, 2, 2, 1, 3, 3), counts);
    }

    @Test
    void countsCharacters() {
        Map<Character, Integer> counts = FrequencyCounter.countCharacters("banana");

        assertEquals(Map.of('b', 1, 'a', 3, 'n', 2), counts);
    }
}
