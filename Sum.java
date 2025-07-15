import java.util.Scanner;
class Sum{
public static void main(String args[]){
Scanner myObj = new Scanner(System.in);
int a,b;
int sum =0;
System.out.print("Enter two number");
a = myObj.nextInt();
b = myObj.nextInt();
sum = a+b;
System.out.println("Sum is "+sum);
}
}
