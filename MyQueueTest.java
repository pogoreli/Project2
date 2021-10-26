import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    MyQueue<Integer> q;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        q = new MyQueue<Integer>();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    @DisplayName("Test method enqueue 1.")
    public void test_meth01 () 
    {   
        q.enqueue(5);
        assertTrue(q.dequeue() == 5);
    }
    
    @Test
    @DisplayName("Test method enqueue 2.")
    public void test_meth02 () 
    {   
        q.enqueue(5);
        q.enqueue(100);
        assertTrue(q.dequeue() == 5);
    }
    
    @Test
    @DisplayName("Test method enqueue 3.")
    public void test_meth03 () 
    {   
        q.enqueue(5);
        q.enqueue(100);
        q.dequeue();
        assertTrue(q.dequeue() == 100);
    }
    
    @Test
    @DisplayName("Test method peek 4.")
    public void test_meth04 () 
    {   
        q.enqueue(5);
        q.enqueue(100);
        q.dequeue();
        assertTrue(q.peek() == 100);
    }
    
    @Test
    @DisplayName("Test method peek 5.")
    public void test_meth05 () 
    {   
        q.enqueue(5);
        q.enqueue(100);
        q.peek();
        assertTrue(q.peek() == 5);
    }
}
