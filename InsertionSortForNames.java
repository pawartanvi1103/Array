
import java.util.Scanner;

public class InsertionSortForNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        for (int i = 1; i < n; i++) {

            String key = names[i];
            int j = i - 1;

            while (j >= 0 && names[j].compareTo(key) > 0) {

                names[j + 1] = names[j];
                j--;
            }

            names[j + 1] = key;
        }

        System.out.println("Names in alphabetical order:");

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
        }

        sc.close();
    }
}
