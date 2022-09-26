package Searching_and_Sorting;

import java.util.Arrays;

public class Merge_sorted_arrays {
    
    private static void merge(int arr1[],int arr2[])
    {
        int m = arr1.length;
        int n = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0, j=0, k=m-1;
        while (i<=k && j<n) {
            if(arr1[i] < arr2[j])
                i++;
            else
            {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


    public static void main(String[] args) {
        
        int arr1[] = {1, 1, 2, 5, 6, 7, 11, 12, 14, 23, 24, 29, 35, 36, 36, 38, 41, 44};
        int arr2[] = {7, 8, 8, 17, 20, 22, 27, 27, 38};
        merge(arr1, arr2);
    }
} 
