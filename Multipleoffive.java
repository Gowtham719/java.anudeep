package arraydemo;
import java.util.Scanner;

public class Multipleoffive {

    public static void printMultiples(int arr[]) {
        int count = 0;

        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printMultiples(arr);  
    }
}

