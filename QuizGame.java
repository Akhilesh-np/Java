import  java.util.Scanner;


public class QuizGame{
    static   Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {

        //Java quiz game
        // questions array
        // option array
        // declare variable
        //welcome message
        //questions loop
        // option loop
        // get guess from user
        // check guess
        //display final score

        String [] questions = { " What is the main funcion of a router ?",
                " Which part of the computer is considered the brain?",
                     "What year was the Facebook launched ?" ,
                            "Who is the father of the computer?",
        "what was the first programming language?"};
        String [] [] options = {
                {"1.storing files", "2.Encrypting data","3.Directiong internet traffic","4.managing passwords"},
                {"1.CPU","2.Hard Drive","3.RAM","4.GPU"},
                {"1.2000","2.2004","3.2006","4.2008"},
                {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charls Babbage"},
                {"1.COBOL","2.C","3.Fortran","4.Assembly"}};
                 int[] answers = {3,1,2,4,3};
                 int score =0;
                 int guess;
        System.out.println("*********************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("****************************");
               for(int i=0;i<questions.length;i++)
               {
                   System.out.println(questions[i]);
                   for(String option : options[i])
                   {
                    System.out.println(option);
                   }
                 System.out.print("Enter your guess:");
                 guess = sc.nextInt();
                 if(guess == answers[i])
                 {
                    System.out.println("***************");
                    System.out.println("CORRECT");
                    System.out.println("*************");
                    score++;
                 }
                else{
                    System.out.println("***************");
                     System.out.println("WRONG!!!");
                     System.out.println("**************");
                }
                System.out.println("Your final score: "+score+" out of "+questions.length);
                
               }



                 sc.close();


    }
}