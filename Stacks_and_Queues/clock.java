package Stacks_and_Queues;

public class clock {
    

    static int clock1(String str)
    {
        int count = 1;
        for(int i=0;i<5;i++)
        {
            System.out.println(i + " " + i+1);
            char ch = str.charAt(i);
            
            if(ch == '?' && i<2)
            {
                if(str.charAt(i+1) == '?')
                    count = 24;
                else if(Character.isDigit(str.charAt(i+1)))
                {
                    if(Integer.parseInt(str.substring(i+1, i+2)) <= 4)
                        count = 3;
                    else
                        count = 2;
                }
                else if (Character.isDigit(ch) && Character.isDigit(str.charAt(i+1)))
                    continue;
                else
                    count = 9;
            }
            else if(ch==':')
                continue;
            else if(ch == '?' && str.charAt(i+1)== '?')
            {
                count *= 60;
                break;
            }   
            else 
            {
                if(ch == '?' && Character.isDigit(str.charAt(i+1)))
                    count *= 6;
                else
                    count *=9;
            //    System.out.println(i+ " "  + i+1);
                
                break;
            }
            

            System.out.println("count in else :" + count);
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(clock1("17:?6"));
    }
}