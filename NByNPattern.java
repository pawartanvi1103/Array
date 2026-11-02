import java.util.Scanner;

public class NByNPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }

        System.out.println("Time complexity: O(n^2)");

        sc.close();
    }
}