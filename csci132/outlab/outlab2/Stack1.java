
/**
 * Skylar Downes
 * 2/1/12
 */
public class Stack1
{
    // instance variables - replace the example below with your own
    private int[] stack = new int[100];
    private int top;
    
    public Stack1()
    {
        top = 0;
    }

    public void push(int pushValue)
    {
        stack[top] = pushValue;
        top++;
    }
    
    public int pop()
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
    public int printStack()
    {
        System.out.println("The stack, from top to bottom:");      
        for (int i = top - 1; i > 0; i--)
        {
            System.out.print(stack[i] + ", ");
        }
        System.out.println(stack[0]);
        return 0;
    }

        
}
