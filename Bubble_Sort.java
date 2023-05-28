import java.util.*;
public class Bubble_Sort{

  public static void sorting(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;i<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the array size");
    int n=sc.nextInt();

    int arr[]=new int[n];

    System.out.println("Enter the data in the array");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    //Call to function for sorting
    sorting(arr);
    //Display the arra
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}