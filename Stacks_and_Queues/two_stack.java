package Stacks_and_Queues;

class two_stack {

    private int top1, top2, arr[], n;

    two_stack(int d){
    this.n = d;
    top1=-1;
    top2=n;
    arr = new int[n];

    }
    void push1(int x)
    {
        if(top1<top2-1)
        {
            top1++;
            arr[top1] = x;
        }
        else
        {
            System.out.println("Stack overflow");
            System.exit(1);
        }
    }
    void push2(int x)
    {
        if(top1<top2-1)
        {
            top2--;
            arr[top2] = x;
        }
        else
        {
            System.out.println("Stack overflow");
            System.exit(1);
        }
    }

    int pop1()
    {
        if(top1>=0)
        {
            int x = arr[top1];
            top1--;
            return x;
        }
        else
        {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2()
    {
        if(top2<=n-1)
        {
            int x = arr[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }
}
class two_stack1
{
    public static void main(String[] args) {
        

        two_stack ts = new two_stack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                           + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from"
                           + " stack2 is " + ts.pop2());
    }
}