package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Group_Anagrams {
    
    static List<List<String>> getAnagrams(String[] str)
    {
        List<List<String>> ans = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            
            String s = str[i]; 
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);

            if(map.containsKey(newString))
            {
                map.get(newString).add(s);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(newString, list);
            }
        }
        Set<String> set = map.keySet();
        for (String string : set) {
            if(map.containsKey(string))
                ans.add(map.get(string));
        }

        return ans;
    }
    public static void main(String[] args) {
        String arr[]
            = { "cat", "dog", "tac", "god", "act" };
        System.out.println(getAnagrams(arr));
    }
}
