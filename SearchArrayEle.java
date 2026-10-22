import java.util.Scanner;
 public class SearchArrayEle{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr size of an array:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enetr an element :");
  for(int i=0; i < arr.length; i++){
  arr[i] = sc.nextInt();

}

System.out.print("Enetr element to search:");
int target = sc.nextInt();
Boolean found = false;

for(int i=0; i<arr.length; i++){
if(arr[i] == target){
found = true;
break;
}
}
if(found){
   System.out.print("Element found");
}else{
   System.out.print("Not found");
}
}
}