package Strings;

public class Remove_consecutive_duplicates {
    
    static String duplicates(String s)
    {
        if(s.length() < 2)
            return s;

        String j ="";
        int i;
        for(i=0; i<s.length()-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
                continue;
            
            j += s.charAt(i);
        }
        j += s.charAt(i);
        return j;
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        System.out.println(duplicates(str)); 
    }
}