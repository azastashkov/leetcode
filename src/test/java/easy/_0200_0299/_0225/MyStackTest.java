package easy._0200_0299._0225;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyStackTest {
    @Test
    public void test() {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertEquals(3, myStack.pop());
        assertEquals(2, myStack.pop());
        assertEquals(1, myStack.pop());

        assertTrue(myStack.empty());

        myStack.push(4);
        myStack.push(5);

        assertEquals(5, myStack.pop());
        assertFalse(myStack.empty());

        myStack.push(6);

        assertEquals(6, myStack.top());

        assertEquals(6, myStack.pop());
        assertEquals(4, myStack.pop());

        assertTrue(myStack.empty());
    }
}
