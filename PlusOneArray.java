import java.util.Scanner;
  public class PlusOneArray{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr number of digit :");
  int n = sc.nextInt();
  int[] digits = new int[n];

  System.out.println("Enetr digits:");
  for(int i=0; i<n; i++){
  digits[i] = sc.nextInt();
 }

  for(int i= n-1; i >= 0; i--){
  if(digits[i] <9){
  digits[i]++;
  break;
 }

  digits[i] =0;
 }

  if(digits[0] == 0){
  int[] result = new int[n + 1];
  result[0] = 1;
  digits = result;
  }

  System.out.print("Result :");
  for(int digit : digits){
  System.out.print(digit);
  }
 }
}







