public class MERGE_SORT {
  public static void sort(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int mid=(si+ei)/2;
    sort(arr, si, mid);
    sort(arr,mid+1,ei);

    merge(arr,si,mid,ei);
  }
  public static void merge(int arr[],int si,int mid,int ei){
    int temp[]=new int[ei-si+1];
    int k=0;
    int i=si;
    int j=mid+1;
    while(i<=mid && j<=ei){
      if(arr[i]>arr[j]){
        temp[k]=arr[j];
        j++;
      }else{
        temp[k]=arr[i];
        i++;
      }
      k++;
    }

    while(i<=mid){
      temp[k++]=arr[i++];
    }
    while(j<=ei){
      temp[k++]=arr[j++];
    }

    for(k=0,i=si;k<temp.length;k++,i++){
      arr[i]=temp[k];
    }
  }
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[]={9,1,5,3,4,7,6,2,8,3,4,5,6};
    sort(arr, 0, arr.length-1);
    print(arr);
  }
}
