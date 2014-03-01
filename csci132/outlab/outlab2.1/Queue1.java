
/**
 * NOT WORKING YET
 * How do you do this without linked lists? Bleh.
 * Skylar Downes
 * 2/1/12
 */
public class Queue1
{
    // instance variables - replace the example below with your own
    private int[] queue = new int[100];
    private int back;
    private int front;
    
    public Queue1()
    {
        back = 0;
        front = 0;
    }

    public void push(int pushValue)
    {
        queue[back] = pushValue;
        back++;
    }
    
    public int pop()
    {
        back--;
        return queue[front];
    }
    
    public boolean isEmpty()
    {
        if (back == 0)
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
        if (back == 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int printQueue()
    {
        System.out.println("The queue, from front to back:");      
        for (int i = back - 1; i > 0; i--)
        {
            System.out.print(queue[i] + ", ");
        }
        System.out.println(queue[0]);
        return 0;
    }

        
}
