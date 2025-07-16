import java.util.Scanner;

public class SimpleBankingSystem{
    static Scanner sc =  new Scanner(System.in);
    public static void  main(String args[])
    {
      
      
        boolean exit =true;
        int choice;
        double balance =0.00;
        
        while(exit == true){ 
        System.out.println("*************************");
        System.out.println("Enter 1 to show balance:");
        System.out.println("Enter 2 to diposit money:");
        System.out.println("***************************");
        System.out.println("Enter 3 to withdraw:");
        System.out.println("Enter 4 to exit:");
        System.out.println("*****************************");
        choice = sc.nextInt();
       switch (choice){
        case 1 -> showBalance(balance);
        case 2 -> balance += diposit();
        case 3 -> balance-= withdraw(balance);
        case 4 -> exit = false;

       }
    } 
    System.out.println("****************************");
    System.out.println("Have a Nice Day!!");
           sc.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double diposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = sc.nextDouble();
        if(amount<0) { System.out.println("Not valid!"); return 0;}
        else
        
        return amount;
    }
    
    static double withdraw(double balance)
    {
        double amount;
        System.out.print("Enter amount to be withdraw:");
        amount = sc.nextDouble();
      
        if(amount> balance)
        {
            System.out.println("INSUFFICIENT FUNDS!!!");
            return 0;
        }
        else if(amount <0)
        {
            System.out.println("Amount can't  be in negative");
            return 0;
        }
        else{
              System.out.println("Amount withdrawn:");
            System.out.println("Remaning funds :"+(balance-amount));
               return amount;

        }
       
    }
}

