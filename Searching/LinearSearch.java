import java.util.Scanner;

public class LinearSearch {
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

        //Search
        System.out.println("Enter the value to be searched in an array: ");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("Value found at " + i + "th location");
                break;
            }
        }
        
    }
}
