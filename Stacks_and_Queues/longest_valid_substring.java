package Stacks_and_Queues;

import java.util.Stack;

public class longest_valid_substring {
    
    static Stack<Integer> stack  = new Stack<>();

    static int result(String str)
    {
        int n = str.length();
        int result =0; 
        for (int i = 0; i < n; i++) {
            
            char ch = str.charAt(i);
            if(ch== '(')
                stack.push(i);
            else
            {
                if(!stack.isEmpty())
                    stack.pop();
                
                if(!stack.isEmpty())
                    result = Math.max(result, i-stack.peek());
                else
                    stack.push(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {

        String str = "((()()";
        System.out.println(result(str));
 
        str = "()(()))))";
        System.out.println(result(str));
    }
}
