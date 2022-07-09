package Strings;


public class Longest_Substring_withoutRepeating {
    
    static int repeating(String s)
    {
        String j="";
        int max=0;
        if(s.isEmpty())
            return 0;

        if(s.length() == 1)
            return 1;
        
        for (char c: s.toCharArray()) {
            String x = String.valueOf(c);

            if(j.contains(x) && s.indexOf(x) < s.length()-2)
                j = j.substring(s.indexOf(x)+1);
            j += x;
            max = Math.max(max, j.length());   
        }
        return max;
    } 

    public static void main(String[] args) {
        String str = "ohomm";
        System.out.println(repeating(str));
    }
}
