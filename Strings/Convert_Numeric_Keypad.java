package Strings;

public class Convert_Numeric_Keypad {

    static String keypad(String[] arr, String k)
    {
        String result="";
        for (int i = 0; i < k.length(); i++) {
            
            if(k.charAt(i) == ' ')
                result +="0";
            else
            {
                int pos = k.charAt(i) - 'A';
                System.out.println( k.charAt(i) - 'A');
                result += arr[pos]; 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                    };
        String input = "GEEKSFORGEEKS";
        System.out.println(keypad(str, input));
    }
    
}
