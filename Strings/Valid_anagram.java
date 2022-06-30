package Strings;

import java.util.HashMap;
import java.util.Set;

public class Valid_anagram {

    static boolean anagram(String a, String b)
    {
        
        if(a.length() != b.length())
            return false;
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            
            if(map.containsKey(a.charAt(i)))
                map.put(a.charAt(i), map.get(a.charAt(i))+1);
            else
                map.put(a.charAt(i),1);
        }

        for (int i = 0; i < b.length(); i++) {

            if(map.containsKey(b.charAt(i)))
            map.put(b.charAt(i), map.get(b.charAt(i))-1);
        }
           
            

        Set<Character> set = map.keySet();
        for (Character character : set) {

            if( map.get(character) !=0)
                return false;
        }
       return true;
    }

    public static void main(String[] args) {
        
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        System.out.println(anagram(str1, str2));
    }
    
}
