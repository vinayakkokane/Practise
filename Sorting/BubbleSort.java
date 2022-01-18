import java.util.*;

public class BubbleSort {
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

        //bubbleSort implementation
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.println("The elements of sorted array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

