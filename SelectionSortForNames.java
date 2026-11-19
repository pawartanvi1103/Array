import java.util.Scanner;
  public class SelectionSortForNames{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter number of nams:");
  int n = sc.nextInt();
  String[] names = new String[n];

  System.out.print("Enter names :");
  for(int i=0; i<n; i++){
   names[i] = sc.next();
}

  for(int i=0; i<names.length-1; i++){
  int min =i;
  for(int j = i+1; j<names.length; j++){
  if(names[j].compareTo(names[min]) < 0){
  min = j;
 }
}

String temp = names[i];
 names[i] = names[min];
 names[min] = temp;
}

System.out.println("Names in alphabetical order");
for(String name : names){
  System.out.print(name + " ");
}
}
}