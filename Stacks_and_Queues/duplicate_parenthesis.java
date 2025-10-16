package Stacks_and_Queues;

import java.util.Stack;

public class duplicate_parenthesis {
    
    static boolean duplicate(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int elements = 0;

            if(ch!=')')
                stack.push(ch);
            else
            {

                char c = stack.pop();
                System.out.println(c + " char pop before loop");
                while(c!= '(')
                {
                    elements++;
                 //    System.out.println(stack.peek());
                    // System.out.println(elements + " elememts");
                    c = stack.pop();
                    System.out.println(stack);
                }   
             //   System.out.println(elements); 
                if(elements==0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        String str = "(a-((c+c)+a))";
 
        if (duplicate(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }
        //Example change to learn Git.
    }
}
