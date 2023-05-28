public class Piglatin {
  public static void main(String[] args) {
    String str="ANDROID";
    str=str.toUpperCase();
    int n=str.length();
    int i=0,j=0;
    while(i<n){
      if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
        j=i;
        break;
      }
      i++;
    }
    String st=str.substring(j)+str.substring(0,j)+"AY";
    System.out.println(st);
  }
}
