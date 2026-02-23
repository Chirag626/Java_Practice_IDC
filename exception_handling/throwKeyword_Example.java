package exception_handling;
class BankAccount
{
   private static double balance;
   
   BankAccount(double balance)
   {
       this.balance = balance;
   }
   
   public void Withdraw(double amount )
  {
 
    try
    {
    if(amount > balance)
    {
        throw new InsufficientFundsException("InsufficientFunds in the account");
    }
       balance = balance - amount; // balance -= amount;
       System.out.println("withdraw Successful\nRamaining Balance: "+balance);
    }
    catch(InsufficientFundsException e1)
    {
        // System.out.println("withdarw Failed"+e1); // to print exception name and message.
        // System.out.println("withdarw Failed"+e1.getMessage()); to print only message.
    	 System.out.println("Message: Withdraw Failed");
        e1.printStackTrace(); // to print all details about exception.
    }
  }
  
class InsufficientFundsException extends RuntimeException
{
    InsufficientFundsException(String Message)
    {
        super(Message);
    }
}
}
public class throwKeyword_Example
{
	public static void main(String[] args) 
	{
	BankAccount b =  new BankAccount(10000.00);
	b.Withdraw(50400.00);
	}
}
