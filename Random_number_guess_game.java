import java.util.Scanner; 
import java.util.Random;
public class Random_number_guess_game{
    public static void main(String args[])
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b =1;
      
        while(a!=b)
        {
            b= r.nextInt(1,11);
            System.out.println("Enter the value to check(1-10)");
            a = sc.nextInt();
            
            if(a!=b)
            { 
            System.out.println("HAHA the value was "+b);
            
            }
            if(a==b)
            {
                System.out.println("Yep "+b+" is the correct guess");
            }

        }
    }
}