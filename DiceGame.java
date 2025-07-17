import java.util.Random;
import java.util.Scanner;

public class DiceGame{
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  public static void main(String args[])
  {
      int numOfDiceRoll;
      int sumOfDiceRoll = 0;
      int roll;
      System.out.println("Enter how many times to roll the dice: ");
      numOfDiceRoll = sc.nextInt();

      if(numOfDiceRoll>0){ 
      for(int i =1;i<=numOfDiceRoll;i++)
      {
         roll = r.nextInt(1,7);
         Display(roll);
         System.out.println("You rolled " + roll);
         sumOfDiceRoll += roll; 
      }
      System.out.println("total "+ sumOfDiceRoll);
    }
    else{
      System.out.println("# of dice roll is invalid!!!");
    }
  }
   static void Display(int roll){
     
    String one = """
           --------
          |        |
          |   •    |
          |        |
           --------  
        """;
        String two ="""
           --------
          |        |
          |  •  •  |
          |        |
           --------  
            """;
            String three ="""
           ---------
          |  •      |
          |    •    |
          |       • |
           --------- 
                """;
                String four ="""
           ---------
          |  •    • |
          |         |
          |  •    • |
           --------- 
                    """;
            String five= """
           ---------
          |  •    • |
          |    •    |
          |  •    • |
           --------- 
                """;
                String six ="""
           ---------
          |  •    • |
          |  •    • |
          |  •    • |
           --------- 

                    """;
     switch(roll){
      case 1 -> System.out.println(one);
      case 2 ->System.out.println(two);
      case 3->System.out.println(three);
      case 4 -> System.out.println(four);
      case 5 ->System.out.println(five);
      case 6 -> System.out.println(six);
    }

}
}