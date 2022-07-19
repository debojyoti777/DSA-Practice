package Two_Dimensional_Matrix;

public class Rotate_Image {
    
    static void reverse(int[][] arr, int i)
    {
        int start =0;
        int end = arr[0].length -1;
        
        while(start < end)
        {
            int temp = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = temp;

            start++;
            end--;
        }
       
    }

    static void rotatematrix(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            reverse(arr, i);
        }
    }

    static void displayMatrix(int arr[][])
    {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(" " + arr[i][j]);
            System.out.print("\n");
        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotatematrix(mat);
        displayMatrix(mat);
    }    
}
