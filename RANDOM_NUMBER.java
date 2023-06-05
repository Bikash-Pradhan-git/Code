import java.util.Scanner;
import java.util.Random;

public class RANDOM_NUMBER {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //FOR ASK QUESTION EVERYTHING

    String str="yes";
    while(str.equals("yes")){
      Random rannum=new Random(); 
      int number=rannum.nextInt(100);//100 means 0 to 100 you can increase
      int Guess=-1;
      int time=0;
     
     System.out.println("Enter a number between 0 to 100");
      while(Guess!=number){
        Guess=sc.nextInt();
        time=time+1;
        if(Guess==number){
          System.out.println("Awesome! you won the Match");
          System.out.println("You take only "+time+" Guessing");
          System.out.println("Do you want to play one more time??? Yes or No");
          str=sc.next().toLowerCase();
        }else if(Guess>number){
          System.out.println("Number is too low");
        }else{
          System.out.println("Enter is too high");
        }
      }
    }
    sc.close();
  }
}
