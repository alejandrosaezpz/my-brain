package stackqueue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void returnsTrueForBalancedBrackets() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void returnsFalseForMismatchedBrackets() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void returnsTrueForEmptyString() {
        assertTrue(solution.isValid(""));
    }
}
