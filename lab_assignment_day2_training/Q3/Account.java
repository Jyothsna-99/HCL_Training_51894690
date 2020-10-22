package lab_assignment_day2_training;

public abstract class Account {
	private String memberName;
	private String accNumber;
	protected int accBalance;

	public Account(String memberName, int accBalance) {
		this.accNumber = 10000 + (int) (Math.random() * 89999) + "";
		this.memberName = memberName;
		this.accBalance = accBalance;
	}

	public String getAccountNumber() {
		return accNumber;
	}

	public void deposit(int amount) {
		accBalance += amount;

	}

	public abstract void withdraw(int amount);

	public abstract int getBalance();

}