import java.util.Scanner;
  public class PrintAllSubArray{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enetr array size:");
   int n = sc.nextInt();
   int[] arr = new int[n];

   System.out.println("Enetr array elemnt :");
   for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
  }

   for(int i=0; i<n; i++){
     for(int j=i; j<n; j++){
       for(int k=i; k<=j; k++){
         System.out.print(arr[k] + " ");
      }
       System.out.println();
     }
    }
   }
  }