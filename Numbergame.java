import java.util.*;
public class Numbergame{
    int randNum;
    int getNum;
    int max=100;
    int count1;
    int count;
    int correctguesses;
    String choice;
   public static void main(String[] args){
    System.out.println("************************");
    System.out.println("Guessing the Number game");
    System.out.println("************************");
    Random random = new Random();
    Numbergame nu=new Numbergame();
    Scanner s= new Scanner(System.in);
    do{
    boolean value=true;
    nu.randNum=random.nextInt(nu.max);
    while(value){  
        System.out.println("Enter the guessing number:");
        nu.getNum=s.nextInt();
        s.nextLine();
        if(nu.getNum==nu.randNum){
            System.out.println("correct guess");
            value=false;
            nu.correctguesses+=1;
        }
        else if(nu.getNum<nu.randNum){
            System.out.println("too low");
            nu.count1+=1;
        }
        else if(nu.getNum>nu.randNum){
            System.out.println("too high");
            nu.count1+=1;
        }
    }
   
    System.out.println("the number of turns to get the correct answer is "+nu.count1);
    System.out.println("Enter \'q\' to quit:");
    nu.choice=s.nextLine();
    nu.count+=1;
}while(!nu.choice.toLowerCase().equals("q"));
 System.out.println("total number of games played ="+nu.count);
System.out.println("correct guesses="+nu.correctguesses);
}
}
