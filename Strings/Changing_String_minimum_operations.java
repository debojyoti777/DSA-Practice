package Strings;

public class Changing_String_minimum_operations {
    
    static int minOps(String a, String b)
    {
        if(a.length() != b.length())
            return -1;
        int[] count = new int[256];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for(int i=0;i<256;i++)
        {
            if(count[i] != 0)
                return -1;
        }
        int res=0, j=b.length()-1, i= a.length()-1;
        while (i >= 0) {
           
            if (a.charAt(i) != b.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        String A = "EACBD";
        String B = "EABCD";
 
        System.out.println(minOps(A, B));
    }
}