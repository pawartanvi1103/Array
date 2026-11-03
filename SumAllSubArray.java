import java.util.Scanner;
  public class SumAllSubArray{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  System.out.print("Enetr array size");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enetr array element :");
  for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

  int total =0;
  for(int i=0; i<n;i++){
  int sum =0;
   for(int j=i; j<n; j++){
   sum += arr[j];
   total += sum;
  }
  }
  System.out.println("Sum of all subarray:" + total);
  }
}