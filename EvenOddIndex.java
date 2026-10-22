
import java.util.Scanner;

class EvenOddIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr array size :");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter an n elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Even index values: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nOdd index values: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
