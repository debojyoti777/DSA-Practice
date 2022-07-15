package Strings;

import java.util.ArrayList;

public class Robin_Karp_Algo {
    
    static final int d = 256;

    static ArrayList<Integer> robin_karp(String s, String p)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = s.length();
        int m  = p.length();
        int hp = 0;
        int ht = 0;
        int q= 101;
        int h=1;
        int j;

        for(int i=0;i<m-1;i++)
            h = (h*d)%q;

        for (int i = 0; i <m; i++) {
            hp = (d*hp + p.charAt(i))%q;
            ht = (d*ht + s.charAt(i))%q; 
        }

        for (int i = 0; i <= n-m; i++) {
            
            if(hp == ht)
            {
                for (j = 0; j < m; j++) {
                    if(s.charAt(i+j) != p.charAt(j))
                        break;
                }
                if(j == m)
                    arr.add(i+1);
            }

            if(i < n-m)
            {
                ht = (d*(ht - s.charAt(i)*h) + s.charAt(i+m))%q;
                if(ht < 0)
                    ht += q;
            }
        }
        if(arr.size() == 0)
            arr.add(-1);
        return arr;
    }

    public static void main(String[] args) {

        String txt = "batmanandrobinarebat";
        String pat = "bat";
            
        System.out.println(
            robin_karp(txt, pat)
        );  
    }
}
