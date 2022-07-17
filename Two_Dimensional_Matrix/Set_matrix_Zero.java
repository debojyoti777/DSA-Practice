package Two_Dimensional_Matrix;

public class Set_matrix_Zero {
    
    static int[][] setzero(int[][] arr)
    {
        boolean firstCol = false, firstRow = false;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            if(arr[0][i] == 0)
                firstRow = true;
        }
        
        for (int i = 0; i < row; i++) {

            if(arr[i][0] == 0)
                firstCol = true;
            
            for (int j = 0; j < col; j++) {
                
                if(arr[i][j] == 0)
                {    arr[0][j] = 0;
                    arr[i][0] = 0; 
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(arr[0][j] == 0 || arr[i][0] == 0)
                    arr[i][j] = 0;
            }
        }

        if(firstRow == true)
        {
            for(int i=0;i<col;i++)
                arr[0][i] = 0;
        }
        if(firstCol == true)
        {
            for(int i=0;i<row;i++)
                arr[i][0] = 0;
        }
   
        return arr;
    } 

    public static void main(String[] args) {
        
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        arr = setzero(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
