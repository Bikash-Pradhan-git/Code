public class Reverse {
  public static void main(String[] args) {
    String str="i love you Bikash";
    str+=' ';
    // String word[]=str.split(" ");
    // for(int i=word.length-1;i>=0;i--){
    //   System.out.print(word[i]+" ");
    // }

    String a="";
    String word[]=new String[100];
    int j=0;
    for(int i=0;i<str.length();i++){
        a+=str.charAt(i);
        if(str.charAt(i+1)==' '){
          word[j]=new String(a);
          i++;
          j++;
          a="";
        }
    }
    for(int i=j-1;i>=0;i--){
      System.out.print(word[i]+" ");
    }
  }
}
