import java.util.*;

class BinarySearch {
    public static int binarySearch(int arr[],int low, int high, int key){
        if (high >= low){
            int mid = low + (high-low)/2;

            if (arr[mid] == key)
                return mid;
            else if(arr[mid] > key)
                return binarySearch(arr, low, mid-1, key);
            else
                return binarySearch(arr, mid+1, high, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter an array-size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        System.out.println("Enter the value to be searched in an array: ");
        int key = sc.nextInt();
        int res = binarySearch(arr,0,n-1,key);
        if (res == -1)
            System.out.println("Not found");
        else
            System.out.println("Value found at position " + res);
    }
}
