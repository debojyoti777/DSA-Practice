package Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class reversing_q_till_k_elements {
    
    static Queue<Integer> q = new LinkedList<>();
    
    static Queue<Integer> reversequeue(Queue<Integer> q)
    {
        if(q.isEmpty())
            return q;
        int data = q.peek();
        q.remove();  
        q = reversequeue(q);
        q.add(data);
        return q;
    }
    static Queue<Integer> reverse(Queue<Integer> q, int k)
    {
        Queue<Integer> q1 = new LinkedList<>();
        while(k!=0)
        {
            q1.add(q.peek());
            q.remove();
            k--;
        }
        
        q1 = reversequeue(q1);
        while(!q.isEmpty())
        {
            q1.add(q.peek());
            q.remove();
        }
        return q1;
    }

    public static void main(String[] args) {
        
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(56);
    queue.add(27);
    queue.add(30);
    queue.add(45);
    queue.add(85);
    System.out.println(queue);
    queue = reverse(queue, 3);
    System.out.println(queue);
    }
}
