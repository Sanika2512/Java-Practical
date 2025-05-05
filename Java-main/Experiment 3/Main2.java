import java.util.*;
class BankAccount{
   
    
     public double Balance;
	public BankAccount(double initial_balance){
	    this.Balance=initial_balance;
	 }
	 
	 public void deposit(double amount){
		 
		 if(amount > 0){
			 Balance+=amount;
			 System.out.println("Deposit Sucessfully    \n Balance:"+ Balance);
			 
		 }
		 else{
			System.out.println("Something Went Wrong"); 
		 }
		 
	 }
	 public void withdraw(double amount){
		 
		 if(amount>0 && Balance>amount){
			 
			 Balance-=amount;
			 System.out.println("withdraw Sucessfully    \n Balance:"+ Balance);
		 }
		 else{
						System.out.println("Something Went Wrong"); 
 
		 }
		 
	 }

}

class SavingsAccount extends BankAccount{
	
	
	
	    public SavingsAccount(double initial_balance){
			 super(initial_balance);
		 }
		  public void withdraw(double amount){
		 
		 if(amount>0 && Balance>amount && (Balance-amount)>=100.0){
			 
			 Balance-=amount;
			 System.out.println("withdraw Sucessfully    \n Balance:"+ Balance);
		 }
		 else{
						System.out.println("Withdraw denied"); 
 
		 }
		 
	 }
	
	
}
class Main2{
	public static void main(String [] args){
	SavingsAccount s1= new SavingsAccount(5000);
	s1.deposit(500);
	s1.withdraw(5200);
	
	
	
	}
}