package Stacks_and_Queues;
import java.util.Stack;

public class special_stack {
    
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    void push(int x)
    {
        
        s1.push(x);
        if (s2.isEmpty()) {
            s2.push(x);
        }
        else{
            int y = s2.peek();

            if(s2.empty() || y>x)
                s2.push(x);
            else
                s2.push(y);
        }
    }
    int pop()
    {
        s2.pop();
        return s1.pop();
    }
    
    int min()
    {
        return s2.pop();
    }

    public static void main(String[] args) {
        
        special_stack s = new special_stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.min());
        s.push(5);
        System.out.println(s.min());
    }
}
