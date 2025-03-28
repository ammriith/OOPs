import java.util.Scanner;
import java.util.Arrays;

class Binaryrecursive {

    void recursive(int arr[], int left, int right, int item) {

        if (left > right) {
            System.out.println("Item cannot be found");
            return;
        }


        int mid = left + (right - left) / 2;


        if (arr[mid] == item) {
            System.out.println("Item found at position: " + (mid + 1)); 
            return;
        }


        if (arr[mid] < item) {
            recursive(arr, mid + 1, right, item);
        } 

        else {
            recursive(arr, left, mid - 1, item);
        }
    }

    public static void main(String args[]) {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        Binaryrecursive binrec = new Binaryrecursive();        
        

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();        
        
        int[] arr = new int[n];
        

        System.out.println("Enter " + n + " numbers: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        Arrays.sort(arr);
        

        System.out.println("Enter the number to be searched: ");
        item = sc.nextInt();       


        binrec.recursive(arr, 0, n - 1, item);
    }
}

