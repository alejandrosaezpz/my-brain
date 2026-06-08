package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MoveZeroesTest {

    private final MoveZeroes solution = new MoveZeroes();

    @Test
    void movesZeroesToEndWhilePreservingOrder() {
        int[] nums = { 0, 1, 0, 3, 12 };

        solution.moveZeroes(nums);

        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
    }

    @Test
    void leavesArrayUnchangedWhenNoZeroesExist() {
        int[] nums = { 1, 2, 3 };

        solution.moveZeroes(nums);

        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }

    @Test
    void handlesAllZeroes() {
        int[] nums = { 0, 0, 0 };

        solution.moveZeroes(nums);

        assertArrayEquals(new int[] { 0, 0, 0 }, nums);
    }
}
