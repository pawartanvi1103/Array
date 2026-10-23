
import java.util.Scanner;

class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

       System.out.print("Enetr the element of an array:");
        for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
         }

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        System.out.print("Enter position (1-n): ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > arr.length + 1) {
            System.out.println("Invalid position");
            return;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos - 1; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos - 1] = value;

        for (int i = pos; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
