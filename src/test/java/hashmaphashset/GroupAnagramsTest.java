package hashmaphashset;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    void groupsWordsByAnagramClass() {
        List<List<String>> actual = solution.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });

        List<List<String>> expected = normalize(List.of(
                List.of("ate", "eat", "tea"),
                List.of("bat"),
                List.of("nat", "tan")));

        assertEquals(expected, normalize(actual));
    }

    @Test
    void returnsEmptyListForEmptyInput() {
        assertEquals(List.of(), solution.groupAnagrams(new String[] { }));
    }

    private List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> normalized = new ArrayList<>();
        for (List<String> group : groups) {
            List<String> copy = new ArrayList<>(group);
            copy.sort(Comparator.naturalOrder());
            normalized.add(copy);
        }
        normalized.sort(Comparator.comparing(group -> String.join("|", group)));
        return normalized;
    }
}
