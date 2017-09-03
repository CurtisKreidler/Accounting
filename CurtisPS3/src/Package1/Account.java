import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private double balanceInitial = 0;
	private Date dateCreated;

	//No-arg constructor
	public Account() {
		this(0, 0, 0, 0);
	}

	//Constructor to create the account object
	public Account(int id, double balance, double annualInterestRate, double balanceInitial) {

		Date date = new Date();

		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.balanceInitial = balanceInitial;
		this.dateCreated = date;
	}

	// class methods
	public int id() {
		return id;
	}

	public double annualInterestRate() {
		return annualInterestRate;
	}

	public double balance() {
		return balance;
	}

	public Date dateCreated() {
		return dateCreated;
	}

	// start of the getters
	public double getMonthlyInterestRate() {
		double rate = this.annualInterestRate / 12;
		return rate;
	}

	public double withdraw(double amount) {
		this.balance = balance - amount;
		return balance;
	}// should return new balance to the account

	public double deposit(double amount) {
		this.balance = balance + amount;
		return balance;
	}// should also return new balance

	// start of the setters
	private void setId(int id) {
		this.id = id;
	}

	private void setAnnualIntrestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

}
