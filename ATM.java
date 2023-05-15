import java.lang.Thread;  
import java.util.Scanner;

class ATM_Transaction
{
    public static void main(String args[] )
    {   
        char c,d;
        float balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        System.out.println("**********Automated Teller Machine**********");
        
        do{
            System.out.print("Card Inserted (Y or N):");
            c = s.next().charAt(0);
            d = 'N';
            if (c!=d){
            sleep();
            
            while(true){
                System.out.println("**********Automated Teller Machine**********");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. EXIT");
                System.out.print("Choose the operation you want to perform:");
                
                
                int n = s.nextInt();
                
                switch(n)
                {
                    case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    sleep();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
     
                    case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    sleep();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;
     
                    case 3:
                    sleep(); 
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;
     
                    case 4:
                    sleep();
                    System.out.println("Thankyou! Please take your card.");
                    System.exit(0);
                }
            }
            };
        }while(Character.compare(c, d) <=0);
        
        
    }
    
    static void sleep(){
        System.out.println("Processing.....");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            } 
    }
}