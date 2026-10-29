import java.util.Scanner;
 public class UniqueArrayValues{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Eneter array size :");
  int n= sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter elemnt of an array :");
  for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
 }

  System.out.print("Unique values ");
  for(int i =0; i<n; i++){
  int count =0;
   for(int j=0; j<n; j++){
   if(arr[i] == arr[j]){
   count++;
  }
  }
  if(count == 1){
    System.out.print(arr[i] + " ");
   }
  } 
 }
}