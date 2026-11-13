import java.util.Scanner;
  public class TripleNestedLoop{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enetr number :");
   int n = sc.nextInt();
   long count =0;

  for(int i =1; i<=n; i++){
    for(int j=1; j<=n; j++){
     for(int k=1; k<=n; k++){
      count++;
  }
}
}

  System.out.println("Total iterations :" + count);
}
}