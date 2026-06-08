package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstUniqueCharacterTest {

    private final FirstUniqueCharacter solution = new FirstUniqueCharacter();

    @Test
    void returnsIndexOfFirstUniqueCharacter() {
        assertEquals(0, solution.firstUniqChar("leetcode"));
    }

    @Test
    void returnsLaterUniqueIndexWhenNeeded() {
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }

    @Test
    void returnsMinusOneWhenNoUniqueCharacterExists() {
        assertEquals(-1, solution.firstUniqChar("aabb"));
    }
}
