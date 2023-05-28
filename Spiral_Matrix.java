public class Spiral_Matrix {
  public static void main(String[] args) {
    int arr[][]={{1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}};
    

    int row=0,endrow=arr.length-1;
    int col=0,endcol=arr.length-1;
    while((row<=endrow) && (col<=endcol)){
      //top
      for(int i=col;i<=endcol;i++){
        System.out.print(arr[row][i]+" ");
      }
      //Right
      for(int i=row+1;i<=endrow;i++){
        System.out.print(arr[i][endcol]+" ");
      }
      //Button
      for(int i=endcol-1;i>=col;i--){
        System.out.print(arr[endrow][i]+" ");
      }
      //left
      for(int i=endrow-1;i>=row+1;i--){
        System.out.print(arr[i][col]+" ");
      }
      row++;
      col++;
      endrow--;
      endcol--;
    }
  }
}
