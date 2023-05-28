public class Word {
  public static void main(String[] args) {
    String str="Hi this is programming hub";
   
    String str1="";
    for(int i=str.length()-1;i>=0;i--){
       str1+=str.charAt(i);
    }
   
    String rev[]=str1.split(" ");

    for(int i=rev.length-1;i>=0;i--){
      System.out.print(rev[i]+" ");
    }
  }
}
