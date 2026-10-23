
import java.util.Scanner;

public class MergeArrApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];  // Changed size to 10

        System.out.print("Enter first array elements: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter second array elements:");
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < 5; i++) {
            c[i + 5] = b[i];  // Copy b, not a
        }

        System.out.print("Merged array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}
