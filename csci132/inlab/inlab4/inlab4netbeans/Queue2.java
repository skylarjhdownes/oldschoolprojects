// This is an array implementation of a queue of integer values
// It is not yet complete, because it does not check for queue full or queue empty, so there will
// be unhandled errors if there is an attempt to dequeue a value from an empty queue or to
// enqueue a value into a full queue.

public class Queue2
{
    // instance variables
    int maxQueueSize = 5;
    int queueSize = 0;
    int[] queue = new int[maxQueueSize];
    int front = 0;
    int back = 0;
    int frontElement;
    Boolean empty = true;
    Boolean full = false;

    public void enqueue(int enqueueValue)
    {
                // ASSERT Precondition: (1) If enqueue is called, the queue is not full. (This must be checked by the
                //        calling method by first calling method isFull in this class and not calling enqueue if
                //        the queue is full. Errors will occur otherwise.) (2) queueSize contains the number of
                //        elements in the queue. (3) back points to the first free element at the back of the qeuue.
       queue[back] = enqueueValue;
                // ASSERT back now points to the last element in the queue, and queueSize contains one less than
                // the number of elements in the queue.
       back = (back+1) % maxQueueSize;
                // ASSERT back now points to the first free element at the end of the queue, unless the
                //        queue is full, in which case it points to the first element of the queue. That is,
                //        the queue has wrapped around and is now full.
                //        However, enqueue will not be called if the queue is full until a dequeue is first
                //        called, resulting in back pointing as it should to the first free element at the end
                //        of the queue. And queueSize contains one less than the number of elelments in the queue.
       queueSize++;
                // ASSERT Postcondition: (1) The enqueueValue has been place at the end of the queue
                //        (2) back points to the first free element of the queue.
                //        (3) queueSize contains the number of elements in the queue.
    }

    public int dequeue()
    {
                // ASSERT Precondition: (1) If dequeue is called, the queue is not empty. (This must be checked by the
                //        calling method by first calling method isEmpty in this class and not calling dequeue if
                //        the queue is empty. Errors will occur otherwise.) (2) queueSize contains the number of
                //        elements in the queue. (3) front points to the frontmost element in the queue.
       frontElement = queue[front];
                // ASSERT firstElement contains the first element of the queue, queueSize is one larger than the
                //        number of elements in the queue (since one was removed), and front points to the now-empty
                //        position in the queue of the element just removed (i.e., to the element just in front of
                //        the queue as it now stands.
       front = (front+1) % maxQueueSize;
                // ASSERT front now points to the frontmost element of the queue.
       queueSize--;
                // ASSERT queueSize now contains the number of elements in the queue.
       return frontElement;
                // ASSERT Postcondition: (1) The first value in the queue has been removed and returned to the caller.
                //        (2) front points to the frontmost element of the queue.
                //        (3) queueSize contains the number of elements in the queue.
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
}


