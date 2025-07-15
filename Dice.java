import java.util.Random;
class Dice{
public static void main(String[] args){
Random random = new Random();
int a;
a = random.nextInt(1,7);
System.out.print(a);
}
}