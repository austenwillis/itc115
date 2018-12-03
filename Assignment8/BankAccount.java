import java.text.NumberFormat;

public class BankAccount {
	private String name;
	private double balance;
	private double transactionFee = 0.00;
	
	public BankAccount(String accountName, double accountBalance, double accountTransFee) {
		name = accountName;
		balance = accountBalance;
		transactionFee = accountTransFee;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getTransactionFee() {
		return transactionFee;
	}


	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}


	public void deposit(double amount) {
		balance = (balance + amount);
		
	}
	public String getBalanceFormatted() {
		String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
		return formattedBalance;
	}
	
	public void withdraw (double amount) {
		if(amount + transactionFee > balance) {
			System.out.println("This will overwithdraw your account. Cannot process.");
		}else {
		balance = (balance - amount)-transactionFee;}
		
	}
	public String toString() {
		return   name +", "+ getBalanceFormatted();
	}

}
