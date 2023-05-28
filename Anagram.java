import java.util.*;
public class Anagram {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter two string");
    String str1=sc.nextLine();
    str1=str1.toLowerCase();
    String str2=sc.nextLine();
    str2=str2.toLowerCase();

    char ch1[]=str1.toCharArray();
    char ch2[]=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    
    if(ch1.length!=ch2.length){
      System.out.println("Not anagram because size are not same");
    }else{
      int i;
      for(i=0;i<ch1.length;i++){
        if(ch1[i]!=ch2[i]){
          break;
        }
      }
      if(i==ch1.length){
        System.out.println("Anagram");
      }else{
        System.out.println("Not anagram word are not match");
      }
    }
  }
}
