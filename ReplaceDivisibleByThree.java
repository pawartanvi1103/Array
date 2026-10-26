import java.util.Scanner;
   public class ReplaceDivisibleByThree{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
  System.out.print("Enetr array size :");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("enter element in array :");
  for(int i=0; i<n ; i++){
  arr[i]= sc.nextInt();
 }

  for(int i=0; i<n; i++){
   if(arr[i] % 3 == 0){
   arr[i] = -1;
   }
}

  System.out.print("Updated array :");
  for(int i=0; i<n; i++){
   System.out.print(arr[i] + " ");
  }
  }
}