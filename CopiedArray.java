import java.util.Scanner;
 public class CopiedArray{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter the size of an array :");
   int n = sc.nextInt();
   int[] arr1 = new int[n];
   int[] arr2 = new int[n];

   System.out.print("Enter the element of an array:");
   for(int i=0; i<arr1.length; i++){
   arr1[i]=sc.nextInt();
  }

  for(int i=0; i<arr1.length; i++){
  arr2[i] = arr1[i];
  }
 
  System.out.print("Copied array");
  for(int i=0; i < arr2.length; i++){
   System.out.print(arr2[i] + " ");
}
}
}