package Searching_and_Sorting;

public class Counting_sort {
    
    private static String sort(char[] arr)
    {
        char[] output = new char[arr.length];
        int[] check = new int[255];

        for (int i = 0; i < arr.length; i++) {
            check[arr[i]]++;
        }
        
        for (int i = 1; i < check.length; i++) {
            check[i] = check[i-1] + check[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
           output[check[arr[i]]-1] = arr[i];
           check[arr[i]] --;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sbf.append(arr[i]);
        }
        String str = new String(sbf);
        return str;
    }

    public static void main(String[] args) {
        
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                       'r', 'g', 'e', 'e', 'k', 's' };
        String str = sort(arr);
        System.out.println(str);
    }
}
