package Two_Dimensional_Matrix;

import java.util.ArrayList;
import java.util.List;

public class Spriral_Matrix {
    
    static List<Integer> spiral(int[][] arr)
    {
        List<Integer> aral = new ArrayList<>();;

        int  k=0, l = 0;
        int row = arr.length;
        int col = arr[0].length;

        while(k<row && l<col)
        {
            for (int i = l; i < col; i++) {
                aral.add(arr[k][i]);
            }
            k++;

            for (int i = k; i < row; i++) {
                aral.add(arr[i][col-1]);
            }
            col--;

            if(k<row)
            {
                for (int i = col-1; i >= l; i--) {
                    aral.add(arr[row-1][i]);
                }
                row--;
            }
            if(l<col)
            {
                for (int i = row-1; i >= k; i--) {
                    aral.add(arr[i][l]);
                }
                l++;
            }
        }
        return aral;
    }

    public static void main(String[] args) {
        int a[][] =  {{1, 2, 3, 4},
                   {5, 6, 7, 8},
                   {9, 10, 11,  12},
                   {13, 14, 15, 16}};
        
        List<Integer> arr  = spiral(a);
        System.out.println(arr);
    }
}
