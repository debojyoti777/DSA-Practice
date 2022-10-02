package Stacks_and_Queues;

import java.util.Stack;

public class postfix_expression {

    private static int postfix(String exp)
    {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            
            char c = exp.charAt(i);
            if(c == ' ')
                continue;
            
            else if(Character.isDigit(c))
            {
                int n=0;
                while(Character.isDigit(c))
                {
                    n = (n*10) + (int)(c-'0');
                    i++;
                    c = exp.charAt(i);
                }
                i--;

                s.push(n);
            }
            else
            {
                int val1 = s.pop();
                int val2 = s.pop();
                switch(c)
                {
                    case '+' :  s.push(val2 + val1);
                                break;
                    case '-' :  s.push(val2-val1);
                                break;
                    case '*' :  s.push(val2*val1);
                                break;
                    case '/' :  s.push(val2/val1);
                }
            }
        }
        return s.pop();
    }



    public static void main(String[] args) {

        String exp = "100 200 + 2 / 5 * 7 +";
        System.out.println(postfix(exp));
    }
}
