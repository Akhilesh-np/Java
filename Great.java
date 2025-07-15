import java.util.Scanner;
class Great
{
    public static void main(String[] args)
    {
        Scanner  myObj = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the three value to check:  ");
        a = myObj.nextInt();
        b= myObj.nextInt();
        c= myObj.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greatest");
            }
            else{
                System.out.println("C is greatest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(+b+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }

        }
    }
}