import java.util.Scanner;

public class FixedInnerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
            }
        }

        System.out.println("Total iterations: " + count);
        System.out.println("Time complexity: O(n)");

        sc.close();
    }
}