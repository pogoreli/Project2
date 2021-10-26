
/**
 * Implementation of a generic queue
 *
 * @Ivan Pogorelov
 * @10/21/2021
 */
public class MyQueue <TheType>
{
    MyLinkedList<TheType> list = new MyLinkedList<TheType>();
    int numberOfElements = 0;
    
    public void enqueue(TheType value)
    {
        list.add(value);
        numberOfElements++;
    }
    
    public TheType dequeue()
    {
        numberOfElements--;
        return list.remove(0);
    }
    
    public TheType peek()
    {
        return list.get(0);
    }
    
    public Boolean isEmpty()
    {
        return numberOfElements==0;
    }
}
