package Two_Dimensional_Matrix;

import java.util.HashMap;
import java.util.Map;


public class common_in_row {
    

    private static int common(int[][] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            if(map.containsKey(arr[i][0]))
                map.put(arr[i][0], map.get(arr[i][0])+1);
            else
                map.put(arr[i][0], 1);

            for (int j = 1; j < col; j++) {
                if(map.containsKey(arr[i][j]))
                    map.put(arr[i][j], map.get(arr[i][j])+1);
                else
                    map.put(arr[i][j], 1);
            }
        }

        for (Map.Entry<Integer,
                   Integer> ele : map.entrySet())
            {
                if (ele.getValue() == row)
                    return ele.getKey();
            }
 
            return -1;
    }


    public static void main(String[] args) {
        int mat[][] = {{ 1, 2, 3, 4, 5 },
                   { 2, 4, 5, 8, 10 },
                   { 3, 5, 7, 9, 11 },
                   { 1, 3, 5, 7, 9 }};
    int result = common(mat);
    if (result == -1)
        System.out.println("No common element");
    else
        System.out.println("Common element is " + result);
    }

}
