package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Print_all_duplicates {
    
    static ArrayList<Character> duplicates(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> aral = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(map.containsKey(x))
                map.put(x, map.get(x)+1);
            else
                map.put(x, 1);
        }
        Set<Character> set = map.keySet();
        for (Character character : set) {
            if(character !=  ' ' && map.get(character) >= 2)
                aral.add(character);
        }
        return aral;
    }

    public static void main(String[] args) {
        String str = "test string";
        System.out.println(duplicates(str));
    }
}
