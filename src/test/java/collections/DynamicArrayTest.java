package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DynamicArrayTest {

    @Test
    void addsAndReadsValues() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(10);
        array.add(20);

        assertEquals(2, array.size());
        assertEquals(10, array.get(0));
        assertEquals(20, array.get(1));
    }

    @Test
    void growsAndRemovesValues() {
        DynamicArray<Integer> array = new DynamicArray<>();
        for (int i = 0; i < 15; i++) {
            array.add(i);
        }

        assertEquals(15, array.size());
        assertEquals(5, array.remove(5));
        assertEquals(14, array.size());
        assertEquals(6, array.get(5));
    }

    @Test
    void updatesAndClearsValues() {
        DynamicArray<String> array = new DynamicArray<>();
        array.add("a");
        array.add("b");

        assertEquals("a", array.set(0, "z"));
        assertEquals("z", array.get(0));
        array.clear();

        assertTrue(array.isEmpty());
        assertEquals(0, array.size());
    }

    @Test
    void throwsForInvalidIndex() {
        DynamicArray<String> array = new DynamicArray<>();

        assertThrows(IndexOutOfBoundsException.class, () -> array.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> array.remove(0));
    }
}
