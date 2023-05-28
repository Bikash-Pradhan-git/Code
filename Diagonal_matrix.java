public class Diagonal_matrix {
  public static void main(String[] args) {
    int arr[][]={{1,2,3,4,5},
                 {6,7,8,9,10},
                 {11,12,13,14,15},
                 {16,17,18,19,20},
                 {21,22,23,24,25}};
    
                 int sum=0;
    // for(int i=0;i<arr.length;i++){
    //   for(int j=0;j<arr[0].length;j++){
    //     if((i==j)||(i+j)==arr[0].length-1){
    //       sum=sum+arr[i][j];
    //     }
    //   }
    // }

    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i][i];
      if(i!=arr.length-1-i){
        sum+=arr[i][arr.length-1-i];
      }
    }
    System.out.println(sum);
  }
}
