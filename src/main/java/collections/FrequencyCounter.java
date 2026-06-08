package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public final class FrequencyCounter {

    private FrequencyCounter() {
    }

    public static Map<Integer, Integer> countIntegers(int[] values) {
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        if (values == null) {
            return counts;
        }

        for (int value : values) {
            counts.merge(value, 1, Integer::sum);
        }

        return counts;
    }

    public static Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        if (text == null) {
            return counts;
        }

        for (int i = 0; i < text.length(); i++) {
            counts.merge(text.charAt(i), 1, Integer::sum);
        }

        return counts;
    }
}
