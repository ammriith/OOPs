import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
{        
    void define(int arr[], int n, int item) 
    {
        int left = 0, right = n - 1;
        while (left <= right)
         {
            int mid = left + (right - left) / 2;
            if (arr[mid] == item) 
            {
                System.out.println("Item found at position: " + (mid + 1));
                return;
            }
            if (arr[mid] < item)
             {
                left = mid + 1;
            }
            else 
            {
                right = mid - 1;
            }
        }
        System.out.println("Item cannot be found");
    }
    public static void main(String args[]) 
    {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        BinarySearch binSearch = new BinarySearch();        
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");      
        for (i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the number to be searched: ");
        item = sc.nextInt();       
        binSearch.define(arr, n, item);
    }
}

