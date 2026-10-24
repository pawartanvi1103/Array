import java.util.Scanner;

public class AlternateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int even = 0;
        int odd = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && even < n) {
                result[even] = arr[i];
                even += 2;
            } else if (arr[i] % 2 != 0 && odd < n) {
                result[odd] = arr[i];
                odd += 2;
            }
        }

        System.out.println("Result:");
        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}