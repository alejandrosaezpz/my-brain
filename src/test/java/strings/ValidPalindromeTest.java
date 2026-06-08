package strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void returnsTrueForPhraseWithPunctuation() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void returnsFalseWhenCharactersDoNotMatch() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void returnsTrueForEmptyString() {
        assertTrue(solution.isPalindrome(""));
    }
}
