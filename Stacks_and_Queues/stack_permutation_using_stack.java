package Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack_permutation_using_stack {
    
    static boolean permutation(int[] ip, int[] op)
    {
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> output = new LinkedList<>();

        for (int i = 0; i < ip.length; i++) {
            input.add(ip[i]);
        }

        for (int i = 0; i < op.length; i++) {
            output.add(op[i]);
        }


        Stack<Integer> temp = new Stack<>();

        while(!input.isEmpty())
        {
            int ele = input.poll();
            if(ele == output.peek())
            {
                output.poll();
                while(!temp.empty())
                {
                    if(temp.peek() == output.peek())
                    {
                        temp.pop();
                        output.poll();
                    }
                    else
                        break;
                }
            }
            else   
                temp.push(ele);

        }
        return (input.isEmpty() && temp.isEmpty());
    }

    public static void main(String[] args)
    {
        // Input Queue
        int input[] = { 1, 2, 3 };
 
        // Output Queue
        int output[] = { 2, 1, 3 };
        if (permutation(input, output))
            System.out.println("Yes");
        else
            System.out.println("Not Possible");
    }
}
