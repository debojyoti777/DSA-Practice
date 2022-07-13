package Strings;

public class Max_length_substring_k_changes {

    static int findsubstring(String str, int k, char ch) {

        int maxlen=0;
        int n = str.length();
        int r= n-1, l=0, cnt=0;
        while(r<n)
        {
            if(str.charAt(r) != ch)
                cnt++;
            
            while(cnt>k)
            {
                if (str.charAt(l) !=ch)
                    cnt--;
                l++;
            }

            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }

    static int answer(String str, int k)
    {

        int maxlen=0;
        for (int i = 0; i < 26; i++) {
            maxlen = findsubstring(str, k, (char)(i+'A'));
            maxlen = findsubstring(str, k, (char)(i+'a'));
        }
        return maxlen;
    }

public static void main(String[] args) {
    
        int k = 4;
        String B = "HHHHHH";
        System.out.println("Maximum length = " + answer(B, k));
}
}
