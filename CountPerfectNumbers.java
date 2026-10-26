
import java.util.Scanner;

public class CountPerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 1; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum = sum + j;
                }
            }

            if (arr[i] > 1 && sum == arr[i]) {
                count++;
            }
        }

        System.out.println("Count of perfect numbers: " + count);

        sc.close();
    }
}
