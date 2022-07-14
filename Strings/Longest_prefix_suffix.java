package Strings;

import java.util.Arrays;

public class Longest_prefix_suffix {
    
    static String longest(String s)
    {
        char arr[] = s.toCharArray();
        int n = arr.length;
        int[] lps = new int[n];

        for (int i = 1; i < n; i++) {
            int j = lps[i-1];
            while(j>0 && arr[j] != arr[i])
                j = lps[j-1];
            if(arr[j] == arr[i])
                j++;
            lps[i] = j;
        }
        int j  =  lps[n-1];
        StringBuffer sdf = new StringBuffer() ;
        for (int i = 0; i < j; i++) {
            sdf.append(arr[i]);
        }
        return sdf.toString(); 
    }

    public static void main(String[] args) {
        String s = "ababab";
        System.out.println(longest(s));
    }
}
