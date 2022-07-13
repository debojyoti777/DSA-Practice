package Strings;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_withoutRepeating {
    
    static int repeating(String s)
    {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
    
    while (j < s.length()) {
        if (! set.contains(s.charAt(j))) {
            set.add(s.charAt(j ++));
            max = Math.max(max, set.size());
        }
      else {
            set.remove(s.charAt(i++));
            System.out.println(i-1);
        }
    }
    
    return max; 
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(repeating(str));
    }
}
