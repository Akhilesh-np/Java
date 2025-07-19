import java.util.Scanner;

public class SearchAndArrangeFoodMenu{ 
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        
        System.out.println("Enter the size");
        int n = sc.nextInt();
        String foods[] = new String[n];
        sc.nextLine();
        
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter the foods");
            foods[i] = sc.nextLine();
        }
        
        System.out.println("Enter(1 for arrangement)(2 for finding some on the foods menu:)");
        int finds = sc.nextInt();
        switch(finds){
            case 1-> Arrangement(foods, n);
            case 2-> Find( foods,n);
        }
    }
   public static void Arrangement(String[] food,int n)
    {
       
        for(int i =0; i<n-1;i++)
        {
            for(int j =0;j<n-i-1;j++)
            {
                if(food[j].compareToIgnoreCase(food[j+1])>0)
                {
                    String temp = food[j];
                    food[j] = food[j+1];
                    food[j+1] = temp;
                }
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(food[i]);
        }
    }
 public   static void Find(String[] food , int n)
    {
        sc.nextLine();
        System.out.println("Enter what to search in the array of foods:");
        String finds = sc.nextLine();
        for(int i =0;i<n;i++)
        {
            if(food[i].equalsIgnoreCase(finds))
            {
                System.out.println(finds+" is found in the array of food");
              
            }
            else
            {
                System.out.println("not found!!!");
                
            }
        }

    }
}