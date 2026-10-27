import java.util.Scanner;
public class AscendingDescendingSort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
    }

    for(int i =0; i<n-1; i++){
     for(int j=0; j<n-1-i; j++){
     if(arr[j] > arr[j + 1]){
     int temp = arr[j];
     arr[j] = arr[j + 1];
     arr[j + 1] = temp;
    }
   }
   }

   System.out.println("Ascending order :");
    for(int i=0; i<n; i++){
     System.out.print(arr[i] + " ");
    }

    System.out.println();

   System.out.println("decending order :");
   for(int i = n-1; i >= 0; i--){
    System.out.print(arr[i] + " ");
   }
   }
  }


