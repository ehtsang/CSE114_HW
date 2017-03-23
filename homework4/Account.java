import java.util.Date;
public class Account{
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	public Account(){
		this.id = 0;
		this.balance = 1000;
		this.annualInterestRate = 4.50;
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 4.50;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated(){
		return this.dateCreated;
	}	
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate / 12;
	}
	
	public void withDraw(double amount){
		if (amount > this.balance){
			System.out.println("There is not enough money to withdraw the requested amount.");
			return;
		} else {
			this.balance -= amount;
		}
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	
}

		