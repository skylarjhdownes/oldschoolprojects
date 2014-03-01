
/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue
{
    // instance variables
    int maxQueueSize = 3;
    int queueSize = 0;
    Patient[] queue = new Patient[maxQueueSize];
    int front = 0;
    int back = 0;
    Patient frontElement;
    Boolean empty = true;
    Boolean full = false;
    
    public void enqueue(Patient enqueueValue)
    {
       queue[back] = enqueueValue;
       back = (back+1) % maxQueueSize;
       queueSize++;
    }

    public Patient dequeue()
    {
       frontElement = queue[front];
       front = (front+1) % maxQueueSize;
       queueSize--;
       return frontElement;
    }

    public Boolean isEmpty(){
        if (queueSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Boolean isFull(){
        if (queueSize == maxQueueSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public void printQueue()
    {
    if (queueSize > 0)
    {
        int counter = 0;
        System.out.println("The queue, from front to back:");      
        for (int i = back - 1; counter < queueSize; i--)
        {
            if (i < 0)
            {
                i = maxQueueSize - 1;
            }
            System.out.print(queue[i].getId() + "/" + queue[i].getPriority() + ", ");
            counter++;
        }
        System.out.println();
    }
    }
}
