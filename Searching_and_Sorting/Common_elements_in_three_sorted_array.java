package Searching_and_Sorting;

import java.util.ArrayList;
import java.util.HashSet;

public class Common_elements_in_three_sorted_array {
    
    private static ArrayList<Integer> common(int[] a, int[] b, int[] c)
    {
        HashSet<Integer> uset = new HashSet<>();
    HashSet<Integer> uset2 = new HashSet<>();
    HashSet<Integer> uset3 = new HashSet<>();
    ArrayList<Integer> arr = new ArrayList<>();
    int n1 = a.length;
    int n2 = b.length;
    int n3 = c.length;
    for (int i = 0; i < n1; i++) {
        uset.add(a[i]);
    }
    for (int i = 0; i < n2; i++) {
        uset2.add(b[i]);
    }
    
    for (int i = 0; i < n3; i++) {
        if (uset.contains(c[i]) && uset2.contains(c[i])) {
            
            if (uset3.contains(c[i]) == false)
                    arr.add(c[i]);
            uset3.add(c[i]);
        }
    }
    return arr;
    }


    public static void main(String[] args) {
        
        int arr1[] = { 1,2, 5, 10, -2, -2,-2,-2,-2};
        int arr2[] = { 6,2, 7, 10};
        int arr3[] = { 3, 4, 10,-2,5};
 
        ArrayList<Integer> arr = common(arr1, arr2, arr3);
        System.out.println(arr);
    }
}
