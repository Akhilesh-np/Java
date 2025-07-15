import java.util.Scanner;
class DisNum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("How any number do you want to enter:");
int n = sc.nextInt();
 
int arr[] = new int[n];

System.out.print("Enter" +n+" numbers:" );
for(int i= 0;i<n;i++)
{
 arr[i] = sc.nextInt();
}
System.out.print
ln("Array numbers are: ");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
}
}