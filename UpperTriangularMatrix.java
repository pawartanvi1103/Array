import java.util.Scanner;
  public class UpperTriangularMatrix{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  System.out.print("Enter the matrix size:");
  int n = sc.nextInt();
  int[][] arr = new int[n][n];

  System.out.print("Enetr matrix elemnt:");
  for(int i=0; i<n; i++){
   for(int j=0; j<n; j++){
    arr[i][j] = sc.nextInt();
  }
  }

  for(int i=0; i<n; i++){
   for(int j=0; j<n; j++){
    if(j >= i){
      System.out.print(arr[i][j] + " ");
    }else{
          System.out.print("0 ");
   }
   }
   System.out.println();
}
}
}