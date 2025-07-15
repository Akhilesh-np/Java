import java.util.Scanner;
class Sumofdigits
{
public static void main(String[] args){
Scanner myObj = new Scanner(System.in);
int a;
int i;
int r,sum=0;
System.out.print("Enter the number:");
a  = myObj.nextInt();
while(a%10>0)
{
 r = a%10;
 sum+=r;
 a =a/10;
}
System.out.println("The sum is "+sum);
}
}
 
