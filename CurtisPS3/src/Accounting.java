package Package1;

import java.util.Date;

public class Accounting {

	private int id;
	private double balance;
	private double annualInterestRate;
	private double balanceInitial = 0;
	private Date dateCreated;
	
	
	{
	 	
	}
	//Constructor to create the account object
	public Account(int id, double balance, double annualInterestRate, double balanceInitial)
	{
		Date date = new Date();
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.balanceInitial = balanceInitial; 
		this.dateCreated = date;
	}
	//No-arg constructor I'm not positve that its done correctly 
	public Account(int id, double balance, double annualInterestRate, double balanceInital)
	{
		this(id, balance, annualInterestRate, balanceIninial, 0)
	}
	
	public int id()
	{
		return id;
	}
	
	public double annualInterestRate()
	{
		return annualInterestRate;
	}
	// start of the getters
	public double balance()
	{
		return balance;
	}
	
	public Date dateCreated()
	{
		return dateCreated;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	// start of the setters 
	public void setAnnualIntrestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getMonthlyInterestRate()
	{
		double rate = this.annualInterestRate / 12;
		return rate;
	}
	
	public double withdraw(double amount)
	{
		this.balance = balance - amount;
		return balance;
	}
	// should return new balance to the account 
	public double deposit(double amount)
	{
		this.balance = balance + amount;
		return balance;
	}
	// should also return new balance 
	
}
