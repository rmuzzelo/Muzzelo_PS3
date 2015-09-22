package MainPackage;
// imports Local Date and Time
import java.time.LocalDateTime;


//Account class
public class Account {
	//Private attributes of account
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private LocalDateTime Datecreated = LocalDateTime.now();

	//No arg-constructor that creates a default account
	public Account() {
		
	}
	//Constructor that creates an account with specified id and initial balance
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		
	}
	//Getters and Setters for id, balance, and annualInterestRate
	public int getid(){
		return id;
	}
	
	public void setid(){
		this.id = id;	
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void setbalance(){
		this.balance = balance;	
	}
	
	
	public double getannualInterestRate(){
		
		return annualInterestRate;
	}
	
	public void setannualInterestRate(){
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public LocalDateTime getDatecreated(){
		return Datecreated;
	}
	
	//Monthly interest rate method
	public double getMonthlyInterestRate(double annualInterestRate){
		double MonthlyInterestRate = annualInterestRate/12;
		return MonthlyInterestRate;	
	}
	//method withdraws specified amount from account
	public void withdraw(double amount) throws InsufficientFundsException{
		
		if (amount <= balance) {
	         balance -= amount;
	      }
		else {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	}
	
	//method deposits specified amount from account
	public void deposit(double amount) {
		balance += amount;
	}

}
