
/**
 * Skylar Downes
 * 2/13/12
 */
public class Stack1
{
    // instance variables - replace the example below with your own
    private Patient[] stack = new Patient[100];
    private int top;
    
    public Stack1()
    {
        top = 0;
    }

    public void push(int id, int priority)
    {
        stack[top] = new Patient(id, priority);
        top++;
    }
    
    public Patient pop()
    {
        top--;
        return stack[top];
    }
    
    public boolean isEmpty()
    {
        if (top == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFull()
    {
        if (top > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void printStack()
    {
        if (top > 0)
        {
            System.out.println("The stack, from top to bottom:");      
            for (int i = top-1; i > 0; i--)
            {
                System.out.print(stack[i].getId() + "/" + stack[i].getPriority() + ", ");
            }
            System.out.println(stack[0].getId() + "/" + stack[0].getPriority() + ".");
        }
    }

        
}
