package Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class reverse_queue {
    
    static Queue<Integer> q = new LinkedList<>();
    
    static Queue<Integer> reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
            return q;
        
        int data = q.peek();
        q.remove();

        q = reverse(q);
        q.add(data);
        return q;
    }

    public static void main(String args[])
{
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(56);
    queue.add(27);
    queue.add(30);
    queue.add(45);
    queue.add(85);
    queue.add(92);
    queue.add(58);
    queue.add(80);
    queue.add(90);
    queue.add(100);
    System.out.println(queue);
    queue = reverse(queue);
    System.out.println(queue);
}
}
