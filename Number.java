import java.util.*;
public class Number {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    String str[]=new String[n];
    int i=0;

    if(n>=100){
    int p=n/100;
    n=n%100;
    if(p>0 && p<4){
      for(int j=0;j<p;j++){
        str[i]="C";
        i++;
      }
      
    }
    if(p>=4 && p<5){
      
        str[i]="CD";
        i++;
      
    }
    if(p>=5 && p<6){
      
        str[i]="D";
        i++;
      
    }
    if(p>=6 && p<7){
      
        str[i]="DC";
        i++;
      
    }
    if(p>=7 && p<8){
      
        str[i]="DCC";
        i++;
      
    }
    if(p>=8 && p<9){
      
        str[i]="DCCC";
        i++;
      
    }
    if(p>=9 && p<10){
      
        str[i]="CM";
        i++;
      
    }
    if(p==10){
      str[i]="M";
      i++;
    }
  if(n==0){
    i--;
  }

}

  ///For checking 2 digit number
  if(n>0 && n<100){
    int p=n/10;
    n=n%10;
    if(p>0 && p<4){
      for(int j=0;j<p;j++){
        str[i]="X";
        i++;
      }
    }
    if(p>=4 && p<5){
      
        str[i]="XL";
        i++;
    }
    if(p>=5 && p<6){
      
        str[i]="L";
        i++;
    }
    if(p>=6 && p<7){
      
        str[i]="LX";
        i++;
    }
    if(p>=7 && p<8){
      
        str[i]="LXX";
        i++;
    }
    if(p>=8 && p<9){
      
        str[i]="LXXX";
        i++;
    }
    if(p>=9 && p<10){
      
        str[i]="XC";
        i++;
    }
  if(n==0){
    i--;
  }
}

  //ONE DIGIT
  switch(n){
    case 1:str[i]="I";
    break;
    case 2:str[i]="II";
    break;
    case 3:str[i]="III";
    break;
    case 4:str[i]="IV";
    break;
    case 5:str[i]="V";
    break;
    case 6:str[i]="VI";
    break;
    case 7:str[i]="VII";
    break;
    case 8:str[i]="VIII";
    break;
    case 9:str[i]="IX";
    break;
  }
  for(int l=0;l<=i;l++){
    System.out.print(str[l]);
  }
  sc.close();
  }
}