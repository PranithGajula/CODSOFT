import java.util.Scanner;
class ATM
{
    int balance=1000;       //initial account balance is intialized to $1000
    UserBankAccount obj;
    public ATM()
    {
        obj=new UserBankAccount();
        obj.setValue(balance);
        
    }
    protected void Withdrawal(int amount)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient Funds\nPlease Try another amount");
        }
        else
        {
        balance-=amount;
        System.out.println("Take your card and wait for the cash");
        System.out.println("Withdrawal of $"+amount+" successfull");
        }
    }
    protected void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Deposit of $"+amount+" is successfull");
    }
    protected void checkBalance()
    {
        System.out.println("Your current Bank Balance is $"+balance);
    }


}
class UserBankAccount
{
    private int accountBalance;

    public void setValue(int accountBalance)
    {
        this.accountBalance=accountBalance;
    }
    public int getAccountBalance()
    {
        return accountBalance;
    }
}


public class ATMInterface 
{
    public static void main(String[] args) 
    {
        int choice=0,amount;
        Scanner sc=new Scanner(System.in);
        ATM atm =new ATM();
        System.out.println("Welcome");
        while(choice!=4)
        {
            System.out.println();
            System.out.println("*********Select the following options*********");
            System.out.println(" 1.Withdrawal\n 2.Deposit\n 3.Check Balance\n 4.Exit");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the amount you want to withdraw");
                amount=sc.nextInt();
                atm.Withdrawal(amount);
            }
            else if(choice==2)
            {
                System.out.println("Enter the amount to deposit");
                amount=sc.nextInt();
                atm.deposit(amount);
            }
            else if(choice==3)
            {
                atm.checkBalance();
            }
            else
            {
                System.out.println("ThankYou:)\nVisit Again");
                choice=4;
            }
        }
        
        sc.close();
        
    }
    
}
