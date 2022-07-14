package Strings;

import java.util.Arrays;

public class Wildcard_matching {
    
    static boolean wildcard(String s, String p)
    {
        boolean[][] match=new boolean[s.length()+1][p.length()+1];
        System.out.println(s.length());
        System.out.println(p.length());
        match[s.length()][p.length()]=true;
        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < match.length; j++) {
                System.out.print(match[i][j] + "  ");
            }
            System.out.println();
        }
        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)!='*')
                break;
            else
                match[s.length()][i]=true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "ge?ks*";
        String p = "geeksforgeeks";
        wildcard(s, p);
     //   System.out.println(wildcard(s, p));
    }
}
