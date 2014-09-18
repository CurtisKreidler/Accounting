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
	
	public Account(int id, double balance, double annualInterestRate, double balanceInitial)
	{
		Date date = new Date();
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.balanceInitial = balanceInitial; 
		this.dateCreated = date;
	}
	
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
	
	public double balance()
	{
		return balance;
	}
	
	public Date dateCreated()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		
	}
	
	
	

}
