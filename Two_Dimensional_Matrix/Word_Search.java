package Two_Dimensional_Matrix;

public class Word_Search {
    
    private static boolean findpat(char[][] arr, int x, int y, String pat, int nrows, int ncol, int pos) {

        int l = pat.length();

        if(pos == l)
            return true;

        if(x<0 || y<0 || x >= nrows || y >=  ncol)
            return false;
        
        if(arr[x][y] == pat.charAt(pos))
        {

            char temp = arr[x][y];
            arr[x][y] = '#';

            boolean res = findpat(arr, x+1, y, pat, nrows, ncol, pos+1) | 
                            findpat(arr, x, y+1, pat, nrows, ncol, pos+1) |
                            findpat(arr, x-1, y, pat, nrows, ncol, pos+1) |
                            findpat(arr, x, y-1, pat, nrows, ncol, pos+1) ;

            arr[x][y] = temp;
            return res;
        }
        else
            return false;
    }

    private static boolean checkMatrix(char[][] arr, String pat)
    {
        int l = pat.length();

        if(l > arr.length*arr[0].length)
            return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == pat.charAt(0))
                    if(findpat(arr, i, j, pat,arr.length,arr[0].length,  0))
                        return true;
            }
        }
        return false;
    }

    

    public static void main(String[] args) {
        
        char grid[][] = { "axmy".toCharArray(),
                        "bgdf".toCharArray(),
                        "xeet".toCharArray(),
                        "raks".toCharArray() };
 
    // Function to check if word exists or not
    if (checkMatrix(grid, "geeks"))
        System.out.print("Yes");
    else
        System.out.print("No");
    }
}
