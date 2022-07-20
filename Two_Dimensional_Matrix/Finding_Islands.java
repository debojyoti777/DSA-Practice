package Two_Dimensional_Matrix;

public class Finding_Islands {
    

    private static void dfs(char[][] arr , int i, int j, int row, int col)
    {

        if(i<0 || j<0 || i>=row || j>=col || arr[i][j] != '1')
            return;
        
        if(arr[i][j]   == '1')
        {
            arr[i][j] = '0';
            dfs(arr, i+1, j, row, col);
            dfs(arr, i, j+1, row, col);
            dfs(arr, i-1, j, row, col);
            dfs(arr, i, j-1, row, col);
            dfs(arr, i+1, j+1, row, col);
            dfs(arr, i-1, j+1, row, col);
            dfs(arr, i+1, j-1, row, col);
            dfs(arr, i-1, j-1, row, col);
        }
    }

    private static int finding(char[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == '1')
                {
                    arr[i][j] = '0';
                    count++;
                    dfs(arr, i+1, j, row, col);
                    dfs(arr, i, j+1, row, col);
                    dfs(arr, i-1, j, row, col);
                    dfs(arr, i, j-1, row, col);
                    dfs(arr, i+1, j+1, row, col);
                    dfs(arr, i-1, j+1, row, col);
                    dfs(arr, i+1, j-1, row, col);
                    dfs(arr, i-1, j-1, row, col);
                }
            }
        }
        return count++;
    }

    public static void main(String[] args) {
        
        char[][] arr = {{'1', '1', '0', '0', '0'},
                 {'0', '1', '0', '0', '1'},
                 {'1', '0', '0', '1', '1'},
                 {'0', '0', '0', '0', '0'},
                 {'1', '0', '1', '0', '1'}};
        
        System.out.print("Number of islands is: " + finding(arr));
    }
}
