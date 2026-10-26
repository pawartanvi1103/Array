import java.util.Scanner;
public class PalindromeArray{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
   }

   Boolean palindrome = true;
  
  for(int i=0; i< n/2; i++){
   if(arr[i] != arr[n - 1 -i]){
   palindrome = false;
   break;
  }
  }

  if(palindrome){
    System.out.print("Array is palindrome " );
  } else{
     System.out.print("Npt palindrome ");
  }
}
}

       