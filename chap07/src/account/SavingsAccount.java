package account;

public class SavingsAccount extends Account {

	public SavingsAccount(String owner, int balance) {
		super(owner, balance);
		
	}

	@Override
	public void withdraw(int money) {
		System.out.println("적금은 출금이 안됩니다. 만기될때까지 기다려요!!");
		
		
	}

}
