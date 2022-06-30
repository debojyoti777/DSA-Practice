package Strings;

public class Valid_palindrome {

    static private boolean valid(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }

    static boolean palindrome(String s)
    {
        int l = 0, r = s.length() - 1;
        s = s.toLowerCase();
        while(l < r) {
            while(!valid(s.charAt(l)) && l < r) {
                l++;
            }
            while(!valid(s.charAt(r)) && r > l) {
                r--;
            }
            char a = s.charAt(l);
            char b = s.charAt(r);
            if(a != b) 
                return false;
            l++;
            r--;
        }
        return true;
    }                                                                                                                                                                                                                                                                                                                                                                           
    public static void main(String[] args) {
        String s = "OP" ;
        System.out.println(palindrome(s));

    }
}