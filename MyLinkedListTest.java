
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Testing the methods of MyLinkedList class
 *
 * @Ivan Pogorelov  
 * @1.0
 */
public class MyLinkedListTest
{
    MyLinkedList<Integer> list;
    MyLinkedList<Float> listOfFloat;
    MyLinkedList<Boolean> listOfBoolean;

    /**
     * Default constructor for test class MyArrayListTest
     */
    public MyLinkedListTest()
    {
        System.out.println("Test started");
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        list = new MyLinkedList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        
        listOfFloat = new MyLinkedList<Float>();
        
        listOfFloat.add(1.1f);
        listOfFloat.add(2.2f);
        listOfFloat.add(3.3f);
        listOfFloat.add(4.4f);
        listOfFloat.add(5.5f);
        listOfFloat.add(6.6f);
        listOfFloat.add(7.7f);
        listOfFloat.add(8.8f);
        listOfFloat.add(9.9f);
        listOfFloat.add(10.10f);
        listOfFloat.add(11.11f);
        listOfFloat.add(12.12f);
        listOfFloat.add(13.13f);
        
        listOfBoolean = new MyLinkedList<Boolean>();
        
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(true);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        list = null;
        listOfFloat = null;
        listOfBoolean = null;
    }
    
    @Test
    @DisplayName("Test method add 1.")
    public void test_meth01 () 
    {
        list.add(5);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 5]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method add 2.")
    public void test_meth02 () 
    {
        list.add(5);
        list.add(6);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 5, 6]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method add 3.")
    public void test_meth03 () 
    {
        list.add(-1);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, -1]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method add 4.")
    public void test_meth04 () 
    {
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method add _float 1.")
    public void test_meth01_float () 
    {
        listOfFloat.add(5.0f);
        String expected = "[1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13, 5.0]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method add_float 2.")
    public void test_meth02_float () 
    {
        listOfFloat.add(5.0f);
        listOfFloat.add(6.5f);
        String expected = "[1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13, 5.0, 6.5]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method add_float 3.")
    public void test_meth03_float () 
    {
        listOfFloat.add(-1.0f);
        String expected = "[1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13, -1.0]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method add_float 4.")
    public void test_meth04_float () 
    {
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        listOfFloat.add(1f);
        String expected = "[1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method add_boolean 1.")
    public void test_meth01_boolean () 
    {
        listOfBoolean.add(true);
        String expected = "[true, false, true, false, true, false, true, false, true, false, true, false, true, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method add_boolean 2.")
    public void test_meth02_boolean () 
    {
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        String expected = "[true, false, true, false, true, false, true, false, true, false, true, false, true, true, false]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method add_boolean 3.")
    public void test_meth03_boolean () 
    {
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.add(false);
        String expected = "[true, false, true, false, true, false, true, false, true, false, true, false, true, true, false, false]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method add 5.")
    public void test_meth05 () 
    {
        list.add(2,10);
        String expected = "[1, 2, 10, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method add 6.")
    public void test_meth06 () 
    {
        list.add(2,10);
        list.add(2,10);
        String expected = "[1, 2, 10, 10, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method add 7.")
    public void test_meth07 () 
    {
        boolean error = false;
        try
        {
            list.add(-2,10);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method add 8.")
    public void test_meth08 () 
    {
        boolean error = false;
        try
        {
            list.add(100,10);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method add_float 5.")
    public void test_meth05_float () 
    {
        listOfFloat.add(2,10.1f);
        String expected = "[1.1, 2.2, 10.1, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method add_float 6.")
    public void test_meth06_float () 
    {
        listOfFloat.add(2,10.1f);
        listOfFloat.add(2,10.1f);
        String expected = "[1.1, 2.2, 10.1, 10.1, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method add_float 7.")
    public void test_meth07_float () 
    {
        boolean error = false;
        try
        {
            listOfFloat.add(-2,10f);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method add_float 8.")
    public void test_meth08_float () 
    {
        boolean error = false;
        try
        {
            listOfFloat.add(100,10f);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method add_boolean 5.")
    public void test_meth05_boolean () 
    {
        listOfBoolean.add(2,false);
        String expected = "[true, false, false, true, false, true, false, true, false, true, false, true, false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method add_boolean 6.")
    public void test_meth06_boolean () 
    {
        listOfBoolean.add(2,false);
        listOfBoolean.add(2,false);
        String expected = "[true, false, false, false, true, false, true, false, true, false, true, false, true, false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method add_boolean 7.")
    public void test_meth07_boolean () 
    {
        boolean error = false;
        try
        {
            listOfBoolean.add(-2,true);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method add_boolean 8.")
    public void test_meth08_boolean () 
    {
        boolean error = false;
        try
        {
            listOfBoolean.add(100,false);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method get 9.")
    public void test_meth09 () 
    {
        assertTrue(list.get(0)==1);
    }
    
    @Test
    @DisplayName("Test method get 10.")
    public void test_meth10 () 
    {
        assertTrue(list.get(1)==2);
    }
    
    @Test
    @DisplayName("Test method get 11.")
    public void test_meth11 () 
    {
        boolean error = false;
        try
        {
            list.get(100);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method get 12.")
    public void test_meth12 () 
    {
        boolean error = false;
        try
        {
            list.get(-5);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method get_float 9.")
    public void test_meth09_float () 
    {
        assertTrue(listOfFloat.get(0)==1.1f);
    }
    
    @Test
    @DisplayName("Test method get_float 10.")
    public void test_meth10_float () 
    {
        assertTrue(listOfFloat.get(1)==2.2f);
    }
    
    @Test
    @DisplayName("Test method get_float 11.")
    public void test_meth11_float () 
    {
        boolean error = false;
        try
        {
            listOfFloat.get(100);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method get_float 12.")
    public void test_meth12_float () 
    {
        boolean error = false;
        try
        {
            listOfFloat.get(-5);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method get_boolean 9.")
    public void test_meth09_boolean () 
    {
        assertTrue(listOfBoolean.get(0)==true);
    }
    
    @Test
    @DisplayName("Test method get_boolean 10.")
    public void test_meth10_boolean () 
    {
        assertTrue(listOfBoolean.get(1)==false);
    }
    
    @Test
    @DisplayName("Test method get_boolean 11.")
    public void test_meth11_boolean () 
    {
        boolean error = false;
        try
        {
            listOfBoolean.get(100);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method get_boolean 12.")
    public void test_meth12_boolean () 
    {
        boolean error = false;
        try
        {
            listOfBoolean.get(-5);
        }catch(Exception ex1)
        {
            error = true;
        }
        assertTrue(error);
    }
    
    @Test
    @DisplayName("Test method clear 13.")
    public void test_meth13 () 
    {
        list.clear();
        list.add(5);
        String expected = "[5]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method clear 14.")
    public void test_meth14 () 
    {
        list.clear();
        assertTrue(list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method clear 15.")
    public void test_meth15 () 
    {
        list.clear();
        list.add(5);
        list.clear();
        list.add(3);
        list.add(6);
        String expected = "[3, 6]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method clear 16.")
    public void test_meth16 () 
    {
        list.add(3);
        list.add(6);
        list.clear();
        assertTrue(list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method clear_float 13.")
    public void test_meth13_float () 
    {
        listOfFloat.clear();
        listOfFloat.add(5.3f);
        String expected = "[5.3]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method clear_float 14.")
    public void test_meth14_float () 
    {
        listOfFloat.clear();
        assertTrue(listOfFloat.isEmpty());
    }
    
    @Test
    @DisplayName("Test method clear_float 15.")
    public void test_meth15_float () 
    {
        listOfFloat.clear();
        listOfFloat.add(5f);
        listOfFloat.clear();
        listOfFloat.add(3f);
        listOfFloat.add(6f);
        String expected = "[3.0, 6.0]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method clear_float 16.")
    public void test_meth16_float () 
    {
        listOfFloat.add(3f);
        listOfFloat.add(6f);
        list.clear();
        assertTrue(list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method clear_boolean 13.")
    public void test_meth13_boolean () 
    {
        listOfBoolean.clear();
        listOfBoolean.add(true);
        String expected = "[true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method clear_boolean 14.")
    public void test_meth14_boolean () 
    {
        listOfBoolean.clear();
        assertTrue(listOfBoolean.isEmpty());
    }
    
    @Test
    @DisplayName("Test method clear_boolean 15.")
    public void test_meth15_boolean () 
    {
        listOfBoolean.clear();
        listOfBoolean.add(true);
        listOfBoolean.clear();
        listOfBoolean.add(false);
        listOfBoolean.add(true);
        String expected = "[false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method clear_boolean 16.")
    public void test_meth16_boolean () 
    {
        listOfBoolean.add(true);
        listOfBoolean.add(true);
        listOfBoolean.clear();
        assertTrue(listOfBoolean.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty 17.")
    public void test_meth17 () 
    {
        assertTrue(!list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty 18.")
    public void test_meth18 () 
    {
        list.clear();
        assertTrue(list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty 19.")
    public void test_meth19 () 
    {
        list.clear();
        list.add(5);
        assertTrue(!list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty 20.")
    public void test_meth20 () 
    {
        list.clear();
        list.add(5);
        list.add(5);
        list.remove(1);
        assertTrue(!list.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_float 17.")
    public void test_meth17_float () 
    {
        assertTrue(!listOfFloat.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_float 18.")
    public void test_meth18_float () 
    {
        listOfFloat.clear();
        assertTrue(listOfFloat.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_float 19.")
    public void test_meth19_float () 
    {
        listOfFloat.clear();
        listOfFloat.add(5f);
        assertTrue(!listOfFloat.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_float 20.")
    public void test_meth20_float () 
    {
        listOfFloat.clear();
        listOfFloat.add(5f);
        listOfFloat.add(5f);
        listOfFloat.remove(1);
        assertTrue(!listOfFloat.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_boolean 17.")
    public void test_meth17_boolean () 
    {
        assertTrue(!listOfBoolean.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_boolean 18.")
    public void test_meth18_boolean () 
    {
        listOfBoolean.clear();
        assertTrue(listOfBoolean.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_boolean 19.")
    public void test_meth19_boolean () 
    {
        listOfBoolean.clear();
        listOfBoolean.add(true);
        assertTrue(!listOfBoolean.isEmpty());
    }
    
    @Test
    @DisplayName("Test method isEmpty_boolean 20.")
    public void test_meth20_boolean () 
    {
        listOfBoolean.clear();
        listOfBoolean.add(true);
        listOfBoolean.add(true);
        listOfBoolean.remove(1);
        assertTrue(!listOfBoolean.isEmpty());
    }
    
    @Test
    @DisplayName("Test method remove 21.")
    public void test_meth21 () 
    {
        list.remove(1);
        String expected = "[1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method remove 22.")
    public void test_meth22 () 
    {
        assertTrue(list.remove(1)==2);
    }
    
    @Test
    @DisplayName("Test method remove 23.")
    public void test_meth23 () 
    {
        assertTrue(list.remove(1)==2);
    }
    
    @Test
    @DisplayName("Test method remove 24.")
    public void test_meth24 () 
    {
        list.remove(1);
        list.remove(1);
        String expected = "[1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method remove_float 21.")
    public void test_meth21_float () 
    {
        listOfFloat.remove(1);
        String expected = "[1.1, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method remove_float 22.")
    public void test_meth22_float () 
    {
        assertTrue(listOfFloat.remove(1)==2.2f);
    }
    
    @Test
    @DisplayName("Test method remove_float 23.")
    public void test_meth23_float () 
    {
        assertTrue(listOfFloat.remove(0)==1.1f);
    }
    
    @Test
    @DisplayName("Test method remove_float 24.")
    public void test_meth24_float () 
    {
        listOfFloat.remove(1);
        listOfFloat.remove(1);
        String expected = "[1.1, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method remove_boolean 21.")
    public void test_meth21_boolean () 
    {
        listOfBoolean.remove(1);
        String expected = "[true, true, false, true, false, true, false, true, false, true, false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method remove_boolean 22.")
    public void test_meth22_boolean () 
    {
        assertTrue(listOfBoolean.remove(1)==false);
    }
    
    @Test
    @DisplayName("Test method remove_boolean 23.")
    public void test_meth23_boolean () 
    {
        assertTrue(listOfBoolean.remove(0)==true);
    }
    
    @Test
    @DisplayName("Test method remove_boolean 24.")
    public void test_meth24_boolean () 
    {
        listOfBoolean.remove(1);
        listOfBoolean.remove(1);
        String expected = "[true, false, true, false, true, false, true, false, true, false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method clone 26.")
    public void test_meth26 () 
    {
        MyLinkedList<Integer> newList = list.clone();
        newList.add(1);
        assertTrue(newList!=list);
    }
    
    @Test
    @DisplayName("Test method clone 27.")
    public void test_meth27 () 
    {
        MyLinkedList<Integer> newList = list.clone();
        list.remove(0);
        assertTrue(newList.remove(0)==1);
    }
    
    @Test
    @DisplayName("Test method clone 28.")
    public void test_meth28 () 
    {
        MyLinkedList<Integer> newList = list.clone();
        assertTrue(list.size() == newList.size());
    }
    
    @Test
    @DisplayName("Test method clone_float 26.")
    public void test_meth26_float () 
    {
        MyLinkedList<Float> newList = listOfFloat.clone();
        newList.add(1f);
        assertTrue(newList!=listOfFloat);
    }
    
    @Test
    @DisplayName("Test method clone_float 27.")
    public void test_meth27_float () 
    {
        MyLinkedList<Float> newList = listOfFloat.clone();
        listOfFloat.remove(0);
        assertTrue(newList.remove(0)==1.1f);
    }
    
    @Test
    @DisplayName("Test method clone_float 28.")
    public void test_meth28_float () 
    {
        MyLinkedList<Float> newList = listOfFloat.clone();
        assertTrue(listOfFloat.size() == newList.size());
    }
    
    @Test
    @DisplayName("Test method clone_boolean 26.")
    public void test_meth26_boolean () 
    {
        MyLinkedList<Boolean> newList = listOfBoolean.clone();
        newList.add(false);
        assertTrue(newList!=listOfBoolean);
    }
    
    @Test
    @DisplayName("Test method clone_boolean 27.")
    public void test_meth27_boolean () 
    {
        MyLinkedList<Boolean> newList = listOfBoolean.clone();
        list.remove(0);
        assertTrue(newList.remove(0)==true);
    }
    
    @Test
    @DisplayName("Test method clone_boolean 28.")
    public void test_meth28_boolean () 
    {
        MyLinkedList<Boolean> newList = listOfBoolean.clone();
        assertTrue(listOfBoolean.size() == newList.size());
    }
    
    @Test
    @DisplayName("Test method size 29.")
    public void test_meth29 () 
    {
        assertTrue(list.size()==13);
    }
    
    @Test
    @DisplayName("Test method size 30.")
    public void test_meth30 () 
    {
        list.add(5);
        assertTrue(list.size()==14);
    }
    
    @Test
    @DisplayName("Test method size 31.")
    public void test_meth31 () 
    {
        list.add(5);
        list.add(5);
        assertTrue(list.size()==15);
    }
    
    @Test
    @DisplayName("Test method size 32.")
    public void test_meth32 () 
    {
        list.clear();
        assertTrue(list.size()==0);
    }
    
    @Test
    @DisplayName("Test method size_float 29.")
    public void test_meth29_float () 
    {
        assertTrue(listOfFloat.size()==13);
    }
    
    @Test
    @DisplayName("Test method size_float 30.")
    public void test_meth30_float () 
    {
        listOfFloat.add(5f);
        assertTrue(listOfFloat.size()==14);
    }
    
    @Test
    @DisplayName("Test method size_float 31.")
    public void test_meth31_float () 
    {
        listOfFloat.add(5f);
        listOfFloat.add(5f);
        assertTrue(listOfFloat.size()==15);
    }
    
    @Test
    @DisplayName("Test method size_float 32.")
    public void test_meth32_float () 
    {
        listOfFloat.clear();
        assertTrue(listOfFloat.size()==0);
    }
    
    @Test
    @DisplayName("Test method size_boolean 29.")
    public void test_meth29_boolean () 
    {
        assertTrue(listOfBoolean.size()==13);
    }
    
    @Test
    @DisplayName("Test method size_boolean 30.")
    public void test_meth30_boolean () 
    {
        listOfBoolean.add(true);
        assertTrue(listOfBoolean.size()==14);
    }
    
    @Test
    @DisplayName("Test method size_boolean 31.")
    public void test_meth31_boolean () 
    {
        listOfBoolean.add(true);
        listOfBoolean.add(true);
        assertTrue(listOfBoolean.size()==15);
    }
    
    @Test
    @DisplayName("Test method size_boolean 32.")
    public void test_meth32_boolean () 
    {
        listOfBoolean.clear();
        assertTrue(listOfBoolean.size()==0);
    }
    
    @Test
    @DisplayName("Test method toString 43.")
    public void test_meth43 () 
    {
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method toString 44.")
    public void test_meth44 () 
    {
        list.remove(1);
        list.remove(1);
        String expected = "[1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";     
        assertTrue(expected.equals(list.toString()));
    }
    
    @Test
    @DisplayName("Test method toString_float 43.")
    public void test_meth43_float () 
    {
        String expected = "[1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method toString_float 44.")
    public void test_meth44_float () 
    {
        listOfFloat.remove(1);
        listOfFloat.remove(1);
        String expected = "[1.1, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13]";     
        assertTrue(expected.equals(listOfFloat.toString()));
    }
    
    @Test
    @DisplayName("Test method toString_boolean 43.")
    public void test_meth43_boolean () 
    {
        String expected = "[true, false, true, false, true, false, true, false, true, false, true, false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method toString_boolean 44.")
    public void test_meth44_boolean () 
    {
        listOfBoolean.remove(1);
        listOfBoolean.remove(1);
        String expected = "[true, false, true, false, true, false, true, false, true, false, true]";     
        assertTrue(expected.equals(listOfBoolean.toString()));
    }
    
    @Test
    @DisplayName("Test method reset 45.")
    public void test_meth45 () 
    {
        list.reset();
        assertTrue(list.counter() == 0);
    }
    
    @Test
    @DisplayName("Test method reset_float 45.")
    public void test_meth45_float () 
    {
        listOfFloat.reset();
        assertTrue(listOfFloat.counter() == 0);
    }
    
    @Test
    @DisplayName("Test method reset_boolean 45.")
    public void test_meth45_boolean () 
    {
        listOfBoolean.reset();
        assertTrue(listOfBoolean.counter() == 0);
    }
    
    @Test
    @DisplayName("Test method next 49.")
    public void test_meth49 () 
    {
        assertTrue(list.next() == 1);
    }
    
    @Test
    @DisplayName("Test method next_float 49.")
    public void test_meth49_float () 
    {
        assertTrue(listOfFloat.next() == 1.1f);
    }
    
    @Test
    @DisplayName("Test method next_boolean 49.")
    public void test_meth49_boolean () 
    {
        assertTrue(listOfBoolean.next() == true);
    }
    
    
}
