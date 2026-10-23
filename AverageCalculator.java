import java.util.Scanner;
 public class AverageCalculator{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the size of an array:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enter the element of an array :");
  for(int i=0; i<arr.length; i++){
  arr[i] =  sc.nextInt();
}

  int sum = 0;
  for(int i =0; i<arr.length; i++){
   sum = sum + arr[i];
}
 double average = (double) sum / arr.length;
 System.out.println("Avarage = " + average);
}
}