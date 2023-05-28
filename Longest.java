public class Longest {
  public static void main(String[] args) {
    String str="i am bikash pradhan ";
    // str=str+' ';
    // String maxword=null;
    // int maxlength=0;
    // String word="";

    // for(int i=0;i<str.length();i++){
    //   word+=str.charAt(i);
    //   if(str.charAt(i+1)==' '){
    //     if(word.length()>maxlength){
    //       maxword=new String(word);
    //       maxlength=word.length();
    //     }
    //     word="";
    //     i++;
    //   }
    // }
    // System.out.println(maxword);
    String word[]=str.split(" ");
    int max=Integer.MIN_VALUE;
    int j=0;

    for(int i=0;i<word.length;i++){
      if(word[i].length()>max){
        max=word.length;
        j=i;
      }
    }
    System.out.println(word[j]);
  }
}
