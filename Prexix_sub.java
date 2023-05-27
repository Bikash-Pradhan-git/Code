import java.util.*;
public class Prexix_sub {
  public static void arrange(int arr[],int n){
    int max=Integer.MIN_VALUE;
    int prefix[]=new int[n];
    prefix[0]=arr[0];
    for(int i=1;i<n;i++){
      prefix[i]=prefix[i-1]+arr[i];
    }
    for(int i=0;i<n;i++){
      int sum=0;
      for(int j=i;j<n;j++){
        sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
      }
      if(max<sum){
        max=sum;
      }
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array:-");
    int n=sc.nextInt();
    try {
      int arr[]=new int[n];
      System.out.println("Enter the data into the array:-");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("The sub array:-");
      arrange(arr,n);
    } catch (Exception e) {
      System.out.println("Enter the valid number:-");
    }
    sc.close();
  }
}
