import java.util.Scanner;
class ArrSum{
public static void main(String[] args){
Scanner myObj = new Scanner(System.in);
int n ,i ,sum=0;
System.out.println("Enter the size:");
n =  myObj.nextInt();
int arr[] = new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter for " +(i+1)+" value: ");
arr[i] = myObj.nextInt();
sum = sum + arr[i];
}

System.out.println("Sum is "+sum);

}
}