import java.util.Scanner;

public class UnionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter second array size: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int size = 0;

        for (int i = 0; i < n; i++) {
            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (c[j] == a[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                c[size++] = a[i];
            }
        }

        for (int i = 0; i < m; i++) {
            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (c[j] == b[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                c[size++] = b[i];
            }
        }

        System.out.println("Union of arrays:");
        for (int i = 0; i < size; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}