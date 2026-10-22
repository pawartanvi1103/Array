import java.util.Scanner;
public class EvenOddCount{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr an array size :");
  int n= sc.nextInt();
  int[] arr = new int[n];
 
 int even =0 , odd =0;

 System.out.print("Enetr array element :");
 for(int i=0; i<arr.length; i++){
 arr[i] = sc.nextInt();
}

for(int i=0; i<arr.length; i++){
 if(arr[i] % 2 == 0){
   even++;
 }else{
   odd++;
}
}
System.out.print("Even count = " + even);
System.out.print("\nOdd count = " + odd);
}
}