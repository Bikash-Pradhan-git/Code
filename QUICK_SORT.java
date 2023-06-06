public class QUICK_SORT {
 public static void sort(int arr[],int si,int ei){
  if(si>=ei){
    return;
  }
  int ind=pivotIndx(arr,si,ei);
  sort(arr, si, ind-1);
  sort(arr,ind+1,ei);
 }
 public static int pivotIndx(int arr[],int si,int ei){
  int i=si-1;
  int pivot=arr[ei];
  for(int j=si;j<ei;j++){
    if(arr[j]<=pivot){
      i++;
      int temp=arr[j];
      arr[j]=arr[i];
      arr[i]=temp;
    }
  }
  i++;
  int temp=arr[i];
  arr[i]=pivot;
  arr[ei]=temp;
  return i;
 }

 public static void print(int arr[]){
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
 }
 public static void main(String[] args) {
  int arr[]={8,1,3,6,5,2,9,4,7,-2,-1};
  sort(arr, 0, arr.length-1);
  print(arr);
 }
}