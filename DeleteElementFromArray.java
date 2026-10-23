import java.util.Scanner;
 public class DeleteElementFromArray{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 System.out.print("Enetr the size of an array:");
 int n = sc.nextInt();
 int[] arr = new int[n];

 System.out.print("Enetr the element of an array :");
 for(int i=0; i<arr.length; i++){
  arr[i] = sc.nextInt();
}

System.out.print("Eneter the position delete:");
int pos = sc.nextInt();

if(pos <1 || pos > arr.length){
  System.out.print("invalid position");
}else{
    for(int i=pos; i < n-1; i++){
    arr[i] = arr[i + 1];
 }
System.out.print("Array after deletion:");
for(int i=0; i<arr.length-1; i++){
System.out.print(arr[i] + " ");
}
}
}
}
 