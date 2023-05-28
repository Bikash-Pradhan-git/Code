public class Counting_sort {
  public static void main(String[] args) {
    int arr[]={1,4,1,3,2,4,7,8,9,10,11,12,4,1,3,6,7,5};

    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      max=Math.max(max,arr[i]);
    }
    int arr2[]=new int[max+1];

    for(int i=0;i<arr.length;i++){
      int value=arr[i];
      arr2[value]++;
    }
    int j=0;
    for(int i=0;i<arr2.length;i++){
      while(arr2[i]>0){
        arr[j]=i;
        arr2[i]--;
        j++;
      }
    }
 //sorting array
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
