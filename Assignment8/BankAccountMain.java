public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount austenAccount = new BankAccount("Austen",100.00,1.00);
		
		austenAccount.setTransactionFee(3.50);
		
		System.out.println(austenAccount.toString());
		
		austenAccount.withdraw(50);
		
		System.out.println(austenAccount.toString());
		System.out.println();

		BankAccount joeAccount = new BankAccount("Joe",1000.00,2.00);
		
		
		System.out.println(joeAccount.toString());

		joeAccount.deposit(1000);
		
		System.out.println(joeAccount.toString());
		System.out.println();

		BankAccount megAccount = new BankAccount("Meg",200,4.00);
		
		System.out.println(megAccount.toString());

		megAccount.withdraw(297);

		
		
		System.out.println(megAccount.toString());

		
	}

}
