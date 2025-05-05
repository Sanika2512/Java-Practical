
class LowBalanceException extends Exception
{
	public LowBalanceException(String message){
		super(message);
	}
}
class NegativeNumberException extends Exception{
	public NegativeNumberException (String message){
		super(message);
	}
}
class BankAccount{
	private double balance; 
	public BankAccount(double initialBalance){
		this.balance=initialBalance;
	}
	public void balanceEnquiry(){
		System.out.println("Current Balance : "+balance);
	}
	public void deposit(double amount)throws NegativeNumberException{
		if(amount <0){
			throw new NegativeNumberException("cannot deposit a negative amount !!!!!!");
		}
balance+=amount;
System.out.println("Deposited : "+amount);
	}
public void withdraw(double amount)throws NegativeNumberException,LowBalanceException{
if(amount <0){
throw new NegativeNumberException("Cannot withdraw a negative amount !");
}
if(amount >balance ){
throw 	new LowBalanceException("Insufficient balance for withdrawl !");
}
balance-=amount;
System.out.println("withdraw: "+amount);
}
}
public class BankApp{
	public static void main(String[] args){
		BankAccount myAccount =new BankAccount(5000);
		try{
			myAccount.balanceEnquiry();
			myAccount.deposit(2000);
			myAccount.withdraw(1000);
			myAccount.deposit(-500);
		}
		catch (NegativeNumberException ex){
			System.out.println("Error: "+ex.getMessage());
		}catch(LowBalanceException ex){
			System.out.println("Error : "+ex.getMessage());
		}
		try{
			myAccount.withdraw(10000);
		}catch(NegativeNumberException ex){
			System.out.println("Error: "+ex.getMessage());
		}
		catch(LowBalanceException ex){
						System.out.println("Error: "+ex.getMessage());
		}
		myAccount.balanceEnquiry();
	}
}
			
		


	

