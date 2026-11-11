package account;

public class CheckingAccount extends Account {

	public CheckingAccount(String owner, int balance) {
		super(owner, balance);
		
	}

	@Override
	public void withdraw(int money) {
		int balance = getBalance();
		if (balance < money) {
			//오류 처리
		} else {
			setBalance(balance - money);
		}

		
	}

}
