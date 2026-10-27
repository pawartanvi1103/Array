import java.util.Scanner;
  public class SmallestMissingElement{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enetr size of array :");
   int n = sc.nextInt();
   int[] arr = new int[n];

   System.out.print("Enter the element of array :");
   for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
   }

   int missing =0;
   for(int i=0; i<n; i++){
    if(arr[i] == missing){
     missing++;
   }
    else if(arr[i] > missing){
     break;
    }
   }
    System.out.print("Missing elemnt :" + missing);
  }
  }