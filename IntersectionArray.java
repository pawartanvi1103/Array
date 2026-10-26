import java.util.Scanner;
  public class IntersectionArray{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the first aar size :");
  int n = sc.nextInt();
  int[] a = new int[n];

  System.out.print("Enetr the first array elemnt :");
  for(int i=0; i<n; i++){
  a[i] = sc.nextInt();
  }

  System.out.print("Enetr the second aar size :");
  int m = sc.nextInt();
  int[] b = new int[m];

  System.out.print("Enetr the second array elemnt :");
  for(int i=0; i<n; i++){
  b[i] = sc.nextInt();
  }

  System.out.print("Common elemnt ");
  for(int i=0; i<n; i++){
  Boolean found = false;
  Boolean alraedyPrinted = false;

  for(int j=0; j<m; j++){
  if(a[i] == b[j]){
  found = true;
  break;
  }
  }

  for(int k=0; k<i; k++){
  if(a[i] == a[k]){
  alraedyPrinted = true;
  break;
  }
}

  if(found && ! alraedyPrinted){
    System.out.print(a[i] + " ");
   }
  }
  }
 }















