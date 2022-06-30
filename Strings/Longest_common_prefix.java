package Strings;

public class Longest_common_prefix {
    
    static int minlength(String[] arr)
    {
        int min=  arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            
            if(min > arr[i].length())
                min = arr[i].length();
        }
        return min;
    }

    static String prefix(String[] arr)
    {
        int minlength = minlength(arr);
        String result = "";
        char x;
        for (int i = 0; i < minlength; i++) {
            
            x = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                
                char x1  = arr[j].charAt(i);
                if(x != x1)
                    return result;
            }
            result += x;
        }
        if(result.length() == 0)
            return "-1";
        return result;
    }

    public static void main(String[] args) {
        
        String arr[] = {"", "b"};
 
        System.out.println(prefix(arr)); 

    }
}
