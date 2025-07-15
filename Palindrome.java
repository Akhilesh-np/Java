import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
Scanner myObj =  new Scanner(System.in);
int n,sum=0,r,num;
System.out.print("Enter the number:");
n = myObj.nextInt();
num =n;
while(n!=0)
{
  r = n%10;
  sum = (sum *10)+r;
   n = n/10;
}
if( num == sum)
 System.out.println(num+" is palindrome");
 else
System.out.println(num+ " is not palindrome");
}
}

