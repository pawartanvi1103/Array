import java.util.Scanner;
  public class NextGreaterElement{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the size of array :");
  int n= sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Eneter the elment of an array :");
  for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
  }

  for(int i=0; i<n; i++){
   int next =-1;
   for(int j= i + 1; j<n; j++){
   if(arr[j] < arr[i]){
   next = arr[j];
   break;
  }
  }
  
 System.out.println(arr[i] + " -> " + next);
}
}
}