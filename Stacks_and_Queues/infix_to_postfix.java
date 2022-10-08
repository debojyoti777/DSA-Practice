package Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class infix_to_postfix {
    
    static int prec(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    static String conversion(String exp)
    {
        String result="";

        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0; i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch))
                result += ch;

            else if(ch == '(')
                stack.push(ch);
            
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek()!= '(')
                {
                    result += stack.pop();
                    //stack.pop();
                }
                stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && prec(ch) <= prec(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
            
        }

        while(!stack.isEmpty())
        {
            if(stack.peek() == '(')
                return "Expression is invalid";
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println(conversion(exp));
    }
}
