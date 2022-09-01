package Searching_and_Sorting;

import java.util.HashMap;

public class majority_element {
    
    public static int majority(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
            {
                int x = map.get(arr[i]);
                map.put(arr[i], x+1);
            }
            if(map.get(arr[i]) > arr.length/2)
            {
                flag = arr[i];
                break;
            }
        }
        System.out.println(map);
        if(flag == 0)
            return -1;
        return flag;
    }



    public static void main(String[] args) {
        
        int arr[] = {2,2,2,2,5,5,2,3,3};
        System.out.println(majority(arr));
    }
}
