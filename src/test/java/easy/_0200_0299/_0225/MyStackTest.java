package easy._0200_0299._0225;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    }
}
