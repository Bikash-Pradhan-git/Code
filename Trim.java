public class Trim{
  public static void main(String args[]){
    String s1="  Universe";
    //Without removing space of the string
    System.out.println(s1.length());

    String s2=s1.trim();
    //Removing space of the string
    System.out.println(s2.length());
  }
}