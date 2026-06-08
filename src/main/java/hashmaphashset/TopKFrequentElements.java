package hashmaphashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int count = entry.getValue();
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(entry.getKey());
        }

        int[] result = new int[Math.min(k, frequency.size())];
        int index = 0;
        for (int count = buckets.length - 1; count >= 0 && index < result.length; count--) {
            if (buckets[count] == null) {
                continue;
            }
            for (int value : buckets[count]) {
                result[index++] = value;
                if (index == result.length) {
                    break;
                }
            }
        }

        return result;
    }
}
