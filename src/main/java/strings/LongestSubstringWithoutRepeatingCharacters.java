package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> lastSeenIndex = new HashMap<>();
        int left = 0;
        int bestLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            Integer previousIndex = lastSeenIndex.get(current);
            if (previousIndex != null && previousIndex >= left) {
                left = previousIndex + 1;
            }
            lastSeenIndex.put(current, right);
            bestLength = Math.max(bestLength, right - left + 1);
        }

        return bestLength;
    }
}
