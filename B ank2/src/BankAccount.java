/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals
 */
public class BankAccount 
{
	private String name;
	private double balance;
	private int acct;
	private static int accountNumber = 0;

	/**
	 * Constructs a bank account with a zero balance
	 */
	public BankAccount()
	{
		balance = 0;
	}
	/**
	 * Constructs a bank account with a given balance
	 * @param initialBalance the initial balance
	 */
	public BankAccount(String name,double initialBalance)
	{
		this.balance = initialBalance;
		this.name = name;
		accountNumber++;
		this.acct = accountNumber;
		
	}
	public char[] getAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}