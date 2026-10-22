import java.util.Scanner;
  public class EvenOddArray{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter array size :");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enter an n elements :");
  for(int i =0 ; i < arr.length; i++){
  arr[i] = sc.nextInt();
 }

  System.out.print("Even no:");
  for(int i=0; i < arr.length; i++){
  if(arr[i] % 2 == 0){
   System.out.print(arr[i] + " ");
  }
  }
   System.out.print("\nOdd no:");
   for(int i=0; i<arr.length; i++){
    if(arr[i] % 2 != 0){
     System.out.print(arr[i] + " ");
   }
   }
  }
 }