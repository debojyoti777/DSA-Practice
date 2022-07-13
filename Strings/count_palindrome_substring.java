package Strings;

public class count_palindrome_substring {
    
    static int palindrome(String str)
    {
        String temp;
        StringBuffer sbf;
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            for (int j =i+1; j <= str.length(); j++) {

                temp = str.substring(i, j);
                sbf = new StringBuffer(temp);
                sbf.reverse();
                String temp1 = new String(sbf);
                if(temp.equals(temp1))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        String str = "abc";
        System.out.println(palindrome(str));
    }
}
