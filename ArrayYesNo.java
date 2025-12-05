package arraydemo;

import java.util.Scanner;

public class ArrayYesNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter search element");
        int a = sc.nextInt();

        searchNumber(arr, a);
    }

    public static void searchNumber(int arr[], int a) {
        for (int k : arr) {
            if (k == a) {
                System.out.println("number found");
                return;
            }
        }
        System.out.println("number not found");
    }
}
