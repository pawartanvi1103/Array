import java.util.Scanner;
 public class InsertionSortCountShift{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter array size:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter array elemnt:");
  for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

int count =0;
for(int i=1; i<n; i++){
int key = arr[i];
int j = i - 1;
while(j >= 0 && arr[j] > key){
arr[j + 1] = arr[j];
count++;
j--;
}
arr[j + 1] = key;
}

System.out.println("Sorted array is");
for(int i=0; i<n; i++){
System.out.println(arr[i] + " ");
}

System.out.println("\nTotal shifts : " + count);
}
}