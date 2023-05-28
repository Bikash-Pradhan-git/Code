import java.util.*;
public class Selection {

  public static void sorting(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        int temp=arr[i];
        if(arr[i]>arr[j]){
          arr[i]=arr[j];
           arr[j]=temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=sc.nextInt();

    int arr[]=new int[n];
    System.out.println("Enter the details in the array");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }

    //Calling function for sorting
    sorting(arr);
    //Display the array
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}