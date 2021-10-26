 /**
 * A generic Linked List
 *
 * @Ivan Pogorelov
 * @09/29/2021
 */
public class MyLinkedList <TheType> {
    // extends Comparable<TheType>
    Node root = new Node();
    Node current = root;
    
    int numberOfElements = 0;
    int internalPrivateCounter = 0;
    
    
    /**
     * Node of a linked list. Stores the user's value and a link to a next node
     */
    private class Node
    {
    
        public TheType value;
        public Node nextNode;
    
        public Node(TheType val, Node next)
        {
            value = val;
            nextNode = next;
        }  
    
        public Node(TheType val)
        {
            value = val;
            nextNode = null;
        }  
    
        public Node()
        {
            nextNode=null;
        }  
    }
    
    /**
     * Adds value to the end of the list
     */
    public void add(TheType e) 
    {
        if(isEmpty())
        {
            root.nextNode = new Node(e);
            current = current.nextNode;
            numberOfElements++;
        }else
        {
            current.nextNode = new Node(e);
            current = current.nextNode;
            numberOfElements++;
        }
    }

    /**
     * Adds value to the user defined index
     */
    public void add(int index, TheType e)
    {
        if(index<0 || index>numberOfElements)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        
        Node CurrentIteration = root.nextNode;
        for(int i = 0; i < index-1; i++)
        {
            CurrentIteration = CurrentIteration.nextNode;
        }
        Node nextValue = CurrentIteration.nextNode;
        CurrentIteration.nextNode = new Node(e, nextValue);
        numberOfElements++;
    }

    /**
     * Retrives the value from an index
     */
    public TheType get(int index)
    {
        if(index<0 || index>size())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        
        Node CurrentIteration = root.nextNode;
        for(int i = 0; i < index; i++)
        {
            CurrentIteration = CurrentIteration.nextNode;
        }
        
        return CurrentIteration.value;
    }

    /**
     * Removes all the values from the list
     */
    public void clear()
    {
        root.nextNode = null;
        numberOfElements = 0;
        current = root;
    }

    /**
     * Returns true if the list does not contain any data
     */
    public boolean isEmpty()
    {
        return (numberOfElements == 0);
    }

    /**
     * Returns a value from selected index and removes it from the list
     */
    public TheType remove(int index)
    {
        if(index<0 || index>numberOfElements)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        
        Node previousNode = root;
        Node CurrentIteration = root.nextNode;

        for(int i = 0; i < index; i++)
        {
            previousNode = CurrentIteration;
            CurrentIteration = CurrentIteration.nextNode;
        }
        
        Node nextValue;
        nextValue = CurrentIteration.nextNode;
        TheType value = CurrentIteration.value;
        previousNode.nextNode = nextValue;
        numberOfElements--;
        return value;
    }

    /**
     * Returns a list class
     */
    public MyLinkedList clone()
    {
        MyLinkedList newList = new MyLinkedList();
        
        for(int i = 0; i < size(); i++)
        {
            newList.add(get(i));
        }
        
        return newList;
    }

    /**
     * Returns the amount of elements in the list
     */
    public int size()
    {
        return numberOfElements;
    }

    /**
     * Resets internal private counter
     */
    public void reset()
    {
        internalPrivateCounter = 0;
    }
    
    /**
     * Returns the next value, defined by internal private counter
     */
    public TheType next()
    {
        if(internalPrivateCounter < numberOfElements)
        {
            internalPrivateCounter++;
        }
        return get(internalPrivateCounter-1);
    }
    
    /**
     * Returns the value of internal private counter
     */
    public int counter()
    {
        return internalPrivateCounter;
    }

    /**
     * Returns a list as a string
     */
    @Override
    public String toString() 
    {
        StringBuilder st = new StringBuilder();
        
        st.append("[");
        
        if(!isEmpty())
        {
            Node CurrentIteration = root.nextNode;
            for(int i = 0; i < numberOfElements; i++)
            {
                st.append(CurrentIteration.value);
                if(i!=numberOfElements-1)
                {
                    st.append(", ");
                }
                CurrentIteration = CurrentIteration.nextNode;
            }
        }
        
        st.append("]");
        
        return st.toString();
    }
}

