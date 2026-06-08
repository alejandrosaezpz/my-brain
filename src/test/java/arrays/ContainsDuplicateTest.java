package arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void returnsTrueWhenDuplicateExists() {
        assertTrue(solution.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void returnsFalseForUniqueValues() {
        assertFalse(solution.containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void returnsFalseForEmptyInput() {
        assertFalse(solution.containsDuplicate(new int[] { }));
    }
}
