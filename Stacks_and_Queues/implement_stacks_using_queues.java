package Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

class implement_stacks_using_queues {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    int curr_size=0;

    void push(int x)
    {
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q;
        q = q1;
        q1 = q2;
        q2 = q;

        curr_size++;
    }

    int pop()
    {
        if(q1.isEmpty())
            return -1;
        int x = q1.peek();
        q1.remove();
        curr_size--;
        return x;
    }

    int top()
    {
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }

    boolean isEmpty()
    {
        return (curr_size == 0)? true : false;
    }
}
class stack{

    public static void main(String[] args) {
        
        implement_stacks_using_queues s = new implement_stacks_using_queues();
        s.push(1);
        s.push(2);
        s.push(3);
 
        System.out.println("current size: " + s.curr_size);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
 
        System.out.println("current size: " + s.curr_size);
        System.out.println(s.top());
    }
}

