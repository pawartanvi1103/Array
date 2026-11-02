import java.util.Scanner;
  public class DivideByTwo{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enetr n:");
    int n = sc.nextInt();

    int count =0;
    while(n > 1){
     n = n/2;
     count++;
     System.out.println(n);
   }
   System.out.print("Iterations:" + count);
   System.out.println("Time complexity :  O(log n)");
}
}

  