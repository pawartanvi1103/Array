import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

   if(n == 0){
     System.out.println("Array is empty");
     sc.close();
    return;
   }
   int max = arr[0];
   int min = arr[0];

   System.out.print("Array:");
   for(int x: arr){
    System.out.print(x + " ");
    
    if(x > max) max = x;
    if(x < min) min = x;
    }

    System.out.println("\nSum :" + sum);
    System.out.println("Maximum :" + max);
    System.out.println("Minimum :" + min);
    
    System.out.print("Reverse: ");
    for(int i = n-1; i>=0; i--){
    System.out.print(arr[i] + " ");
   }
  }
 }