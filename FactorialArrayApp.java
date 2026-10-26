import java.util.Scanner;

public class FactorialArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers from 0 to n:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < 0 || arr[i] > n) {
                System.out.println("Enter values from 0 to n only.");
                sc.close();
                return;
            }
        }

        System.out.println("Factorial array:");

        for (int i = 0; i < n; i++) {
            long fact = 1;

            for (int j = 1; j <= arr[i]; j++) {
                fact = fact * j;
            }

            System.out.print(fact + " ");
        }

        sc.close();
    }
}