package Searching_and_Sorting;

public class ttriplets_with_small_sum {
    
    private static int triplets(int[] arr, int x)
    {
        int n = arr.length;
        int ans=0;
        for (int i = 0; i < n-2; i++) {
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                if(arr[i] + arr[j] + arr[k] >= x)
                    k--;
                else
                {
                    ans +=(k-j);
                    System.out.println(ans + " ans");
                    System.out.println(k + " k");
                    System.out.println(j + " j");
                    j++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        
        int arr[] = new int[]{5, 1, 3, 4, 7};
        int sum = 12;
        System.out.println(triplets(arr, sum));
    }
}
