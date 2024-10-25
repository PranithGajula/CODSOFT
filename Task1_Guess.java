// 1. Generate a random number within a specified range, such as 1 to 100.

// 2. Prompt the user to enter their guess for the generated number.

// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.

// 4. Repeat steps 2 and 3 until the user guesses the correct number.

// You can incorporate additional details as follows:

// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.








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
    
