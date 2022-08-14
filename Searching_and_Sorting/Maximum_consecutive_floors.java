package Searching_and_Sorting;

import java.util.Arrays;

public class Maximum_consecutive_floors {
    
    private static int consecutive(int[] arr, int top, int bot)
    {
        Arrays.sort(arr);
        if(top-bot+1 == arr.length)
            return 0;
        int x=Integer.MIN_VALUE;
        int i=0;
        int j=bot;
        int n = arr.length;
        while(i<n)
        {
            x = Math.max(x, (arr[i] - j)+1);
            j= arr[i]+1;
            System.out.println("x=" + x + "j=" + j);
            i++;
        }
        x = Math.max(x, (top - j));
        return x;
    }

    public static void main(String[] args) {
      int  bottom = 3, top = 15; 
      int[] special = {7,9,13};

      System.out.println(consecutive(special, top, bottom));
    }
}
