import java.util.Scanner;
import java.lang.Math;

public class Task1_Guess 
{
    public static void main(String[] args)
    {
        int attempts=10;
        System.out.println("*************Guess the Number*************");
        int num=(int)(Math.random()*10);
       
        System.out.println("Guess the number in the range of 1 to 100");
        Scanner guessed=new Scanner(System.in);
        
        
            while(attempts>0)
            {
                System.out.println("Enter Your Guess:");
                int guessed_no=guessed.nextInt();
                if(num>guessed_no)
                {
                    System.out.println("Your guess is too low");
                    attempts-=1;
                    System.out.println("You have more " + attempts + " attempts");
                    System.out.println("Guess again");
                    

                }
                else if(num<guessed_no)
                {
                    System.out.println("Your guess is too high");
                    attempts-=1;
                    System.out.println("You have more " + attempts + " attempts");
                    System.out.println("Guess again");
                   
                }
                else
                {
                    System.out.println("Congratulations!!! You won the game The number you guessed is " + guessed_no + " is correct");
                    System.out.println("Your Final Score is: " + attempts*10);
                    break;
                }

                
            }
            if(attempts==0)
                System.out.println("All the 10 attempts you used, Try again");
            guessed.close();
    
        
    }

}
    
