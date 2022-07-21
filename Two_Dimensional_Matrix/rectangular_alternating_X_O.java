package Two_Dimensional_Matrix;

public class rectangular_alternating_X_O {
    
    private static void fillup(int row, int col)
    {
        char[][] arr = new char[row][col];

        int k=0, l =0;
        char x='X';
        int n = col;
        int m = row;
        while(k<row&& l<col)
        {
            for (int i = l; i <col; i++) {
                arr[k][i] = x;
            }
            k++;

            for (int i = k; i < row; i++) {
                arr[i][col-1] = x;
            }
            col--;
            if(k<row)
            {
                for (int i = col-1; i >= l; --i)
                    arr[row-1][i] = x;
                row--;
            }
            if(l<col)
            {
                for (int i = row-1; i >= k; --i)
                    arr[i][l] = x;
                l++;
            }

            x = (x == '0')? 'X': '0';
        }
        for (int i = 0; i < m; i++)
        {
        for (int j = 0; j < n; j++)
            System.out.print(arr[i][j] + " ");
        System.out.println();
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Output for m = 5, n = 6");
        fillup(5, 6);
    }
}
