import java.util.Scanner; 
import java.util.Random;
public class Main{
    public static void main(String args[])
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b =0;
        b = r.nextInt(1,11);
        while(a!=b)
        {
            System.out.println("Enter the value to check");
            a = sc.nextInt();
            
            if(a!=b)
            { 
            System.out.println("HAHA the value was "+b);
            b= r.nextInt(1,11);
            }
            if(a==b)
            {
                System.out.println("Yep "+b+" is the correct guess");
            }

        }
    }
}