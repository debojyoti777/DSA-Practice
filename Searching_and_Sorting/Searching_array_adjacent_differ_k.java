package Searching_and_Sorting;

public class Searching_array_adjacent_differ_k {
    
    private static int search(int[] arr, int k, int x)
    {
        int n = arr.length, i=0;
        while(i<n)
        {
            if(arr[i] == x)
                return i;
            
            i = i+ Math.max(1, Math.abs(arr[i]-x)/k);
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
         
        System.out.println("Element " + x +
                        " is present at index "
                        + search(arr, k, x));
    }
}
