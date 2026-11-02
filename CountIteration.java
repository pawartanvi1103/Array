import java.util.Scanner;
  public class CountIteration{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter n:");
  int n = sc.nextInt();

  int count = 0;

  for(int i =0; i<n; i++){
   System.out.print(i + " ");
   count++;
  }

  System.out.println("\nTotal iterations :" + count);
  System.out.println("Time complexity: O(n)");
 }
}