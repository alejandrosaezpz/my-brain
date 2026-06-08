package stackqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void tracksMinimumAcrossPushAndPopOperations() {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        assertEquals(-3, stack.getMin());
        assertEquals(-3, stack.pop());
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

    @Test
    void handlesDuplicateMinimumValues() {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(2);
        stack.push(1);
        stack.push(1);

        assertEquals(1, stack.getMin());
        assertEquals(1, stack.pop());
        assertEquals(1, stack.getMin());
    }

    @Test
    void throwsWhenAccessingEmptyStack() {
        MinStack stack = new MinStack();

        assertTrue(stack.isEmpty());
        assertThrows(NoSuchElementException.class, stack::pop);
        assertThrows(NoSuchElementException.class, stack::top);
        assertThrows(NoSuchElementException.class, stack::getMin);
    }
}
