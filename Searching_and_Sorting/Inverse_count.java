package Searching_and_Sorting;

public class Inverse_count {
    
    private static int inverse(int arr[])
    {
        int k=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                    k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {

        int arr[] = new int[] { 1, 20, 6, 4, 5 };
        System.out.println("Number of inversions are "
                           + inverse(arr));
    }
}
