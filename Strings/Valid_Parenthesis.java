package Strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_Parenthesis{

    static boolean parenthesis(String arr)
    {
        Deque<Character> stack = new ArrayDeque<Character>(); 

        for (int i = 0; i < arr.length(); i++) {
            
            char x = arr.charAt(i);
            if((x == '{') || (x == '[') || (x == '('))
            {
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char check ;
                switch(x)
                {
                    case ']' :  check = stack.pop();
                                if((check == '{') || (check == '('))
                                    return false;
                                break;
                    case '}' :  check = stack.pop();
                                if((check == '[') || (check == '('))
                                    return false;
                                break;
                    case ')' :  check = stack.pop();
                                if((check == '[') || (check == '{'))
                                    return false;
                                break;
                }         
            }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        
        String expr = "([{}]){}";
        System.out.println(parenthesis(expr));
    }
    
}
