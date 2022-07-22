package Searching_and_Sorting;

import java.util.Arrays;

public class Sum_of_every_pair_is_greater_than_K {
    
    private static boolean sum(int[] a, int[] b, int k)
    {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length / 2; i++) {
            int t = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = t;
        }
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            if(a[i] + b[i] < k)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
    int a[] = {2, 1, 3};
    int b[] = {7, 8, 9};
    int k = 10;
 
    if (sum(a, b, k))
        System.out.print("Yes");
    else
        System.out.print("No");
    }
}
