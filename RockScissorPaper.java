/* Declare variable to take input
take  input from the user
create random task for Rock ,scissor or paper
compare the numbers
give reasults
ask to play again
 */
import java.util.Scanner;
import java.util.Random;
public class RockScissorPaper
{
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String args[])
    {
     
        String choices[] = {"scissors","paper","rock"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";



       
       do { 
         System.out.print("Enter your choice(rock,paper,scissors): ");
        playerChoice = sc.nextLine().toLowerCase();
       if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) 
       {
        System.out.println("*****************");          
        System.out.println("NOT VALID!!!!!");
        System.out.println("******************");
        continue;
       }
       computerChoice = choices[r.nextInt(3)];
       System.out.println("Computer choice: "+computerChoice);
        if(playerChoice.equals(computerChoice))
        {
            System.out.println("It's a tie ");
            
        }
        else if((playerChoice.equalsIgnoreCase("Rock")&&computerChoice.equalsIgnoreCase("Scissors")) || playerChoice.equalsIgnoreCase("Scissors")&& computerChoice.equalsIgnoreCase("Paper") || playerChoice.equalsIgnoreCase("Paper")&&computerChoice.equalsIgnoreCase("Rock"))   
        {
            System.out.println("You win");
        }
        
        else 
        {
            
            System.out.println("You loose");
        }
    
        System.out.println("Play again??");
        playAgain = sc.nextLine().toLowerCase();
    }while(playAgain.equalsIgnoreCase("Yes"));
    System.out.println("Thanks for playing!!!");




              
                
          
          
    }
                 


}
