import java.util.Scanner;
 public class MultiplyByTwo{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enetr n:");
    int n = sc.nextInt();

    int value = 1;
    int count = 0;

    while(value <= n){
     System.out.println(value);
     value = value * 2;
     count++;
   }

   System.out.println("Iterarions :" + count);
   System.out.print("Time  complexity: O(log n)");
}
}