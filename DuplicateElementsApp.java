import java.util.Scanner;
  public class DuplicateElementsApp{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the size of an array :");
  int n = sc.nextInt();
  int[] arr = new int[n];
  boolean[] visited = new boolean[n];
  boolean found = false;

  System.out.print("Enetr the array element :");
  for(int i=0; i<arr.length; i++){
  arr[i] = sc.nextInt();
  }

  System.out.print("Dupicate elemnt :");
    for(int i=0; i<n; i++){
       if(visited[i]){
        continue;
  }
  
  int count = 1;
  for(int j= i + 1; j<n; j++){
  if(arr[i] == arr[j]){
    count++;
  visited[j] = true;
   }
  }

  if(count > 1){
   System.out.print(arr[i] + " ");
   found = true;
 }
}

  if(!found){
   System.out.print("No duplicate found");
}
}
}





