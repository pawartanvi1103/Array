import java.util.Scanner;
  public class ReplaceFirstLast {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter array size: ");
   int n = sc.nextInt();
   int[] arr = new int[n];

  System.out.print("Enter array elements: ");
   for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
   }

   arr[0] = 0;
   arr[n - 1] = 0;
   
  System.out.print("Updated array :");
  for(int i=0; i<n; i++){
   System.out.print(arr[i] + " ");
  }
}
}