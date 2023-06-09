import java.util.*;
public class Insertion_Sort {
  public static void sorting(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>curr){
          arr[prev+1]=arr[prev];
          prev--;
        }
        arr[prev+1]=curr;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=sc.nextInt();

    int arr[]=new int[n];

    System.out.println("Enter the data in the array");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    //Call to function for sorting
    sorting(arr);

    //Display the array
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
