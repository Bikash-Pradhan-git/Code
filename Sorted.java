public class Sorted {
  public static void main(String[] args) {
    int arr[][]={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

    int key=39;
    
    int row=0,col=arr[0].length-1;
    while((row>=arr.length-1)||(col>=0)){
      if(key==arr[row][col]){
        System.out.println(key+" is found at index "+(row+1)+" "+(col+1));
        break;
      }
      if(key>arr[row][col]){
        row++;
      }
      if(key<arr[row][col]){
        col--;
      }
    }   
  }
}
