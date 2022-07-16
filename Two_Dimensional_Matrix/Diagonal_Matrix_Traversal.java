package Two_Dimensional_Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Diagonal_Matrix_Traversal {
    
    static int row;
    static int col;
    static boolean isValid(int i, int j )
    {
        if(i<0 || i>=row || j<0 || j>=col)
            return false;
        return true;
    }

    static int[] diagonal(int[][] arr)
    {
        row = arr.length;
        col = arr[0].length;
        
        ArrayList<Integer> aral2 = new ArrayList<>();
        
        int  i, j, k;

        for(k=0;k<row;k++)
        {
            ArrayList<Integer> aral = new ArrayList<>();
            aral.add(arr[k][0]);
            i = k-1;
            j = 1;
            
            while(isValid(i, j))
            {
                aral.add(arr[i][j]);
                i--;
                j++;
            }

            if(k%2 !=0)
                Collections.reverse(aral);

            for (int x : aral) {
                aral2.add(x);
            }
        }

        for(k=1;k<col;k++)
        {
            ArrayList<Integer> aral = new ArrayList<>();
            aral.add(arr[row-1][k]);

            i = row-2;
            j = k+1;

            while(isValid(i, j))
            {
                aral.add(arr[i][j]);
                i--;
                j++;
            }
             if(k%2!=0)
                Collections.reverse(aral);
            
            for (int x : aral) {
                aral2.add(x);
        }
    }
    int[] ar = new int[aral2.size()];
    for (i=0; i<aral2.size();i++)
        ar[i] = aral2.get(i);

    return ar;
    }

    //This is an alternative and a very fast solution
    // if (matrix.length == 0) return new int[0];
    //     int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = matrix[r][c];
    //         if ((r + c) % 2 == 0) { // moving up
    //             if      (c == n - 1) { r++; }
    //             else if (r == 0)     { c++; }
    //             else            { r--; c++; }
    //         } else {                // moving down
    //             if      (r == m - 1) { c++; }
    //             else if (c == 0)     { r++; }
    //             else            { r++; c--; }
    //         }   
    //     }   
    //     return arr;
    // }
    
    public static void main(String[] args) {
        
        int arr[][] = {
            {1, 2, 3},
     {4, 5, 6},
     {7, 8, 9}};
       
        System.out.println(Arrays.toString(diagonal(arr)) );
    }
}
