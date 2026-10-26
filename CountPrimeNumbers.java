
import java.util.Scanner;

public class CountPrimeNumbers {
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
            boolean prime = true;

            if (arr[i] <= 1) {
                prime = false;
            } else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println("Count of prime numbers: " + count);

        sc.close();
    }
}
