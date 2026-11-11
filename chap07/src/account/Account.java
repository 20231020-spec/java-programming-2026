package account;

public abstract class Account {
	private String owner;
	private int balance;
	
	public Account (String owner, int balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public void deposit(int money) {
		this.balance += money;
	}
	
	public abstract void withdraw(int money);
	

}
