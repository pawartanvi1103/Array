import java.util.Scanner;
 public class MoveZeroLastPos{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the size of an array :");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enetr the element of an array :");
  for(int i=0; i<arr.length; i++){
   arr[i] = sc.nextInt();
   }

  int index =0;
  for(int i=0; i<n; i++){
    if(arr[i] != 0){
    arr[index] = arr[i];
    index++;
   }
}

  while(index < n){
   arr[index] = 0;
   index++;
  }

  System.out.println("Array after moving zeros :");
  for(int value : arr){
   System.out.print(value + " ");
  }
  }
}
 