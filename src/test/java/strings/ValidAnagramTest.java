package strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void returnsTrueForAnagrams() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void returnsFalseForDifferentLetters() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void returnsTrueForEmptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }
}
