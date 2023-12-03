public class FinancialApp{

	private double monthlyInterestRate;
	private double monthlyPayment;
	private double monthlyInterest;
	private double loanAmount;
	private double annualInterestRate;
	private double numberOfYears;



	public FinancialApp(){
		this.monthlyInterestRate = monthlyInterestRate;

	}


	public void setMonthlyPayment(double monthlyPayment){
		this.monthlyPayment = monthlyPayment;
	}

	public double getMonthlyPayment(){
		return monthlyPayment;
	}

	
	public void setMonthlyInterest(double monthlyInterest){
		this.monthlyInterest = monthlyInterest;
	}

	public double getMonthlyInterest(){
		return monthlyInterest;
	}

	public void setLoanAmount(double loanAmount){
		this.loanAmount = loanAmount
	}
	
	public double getloanAmount(){
		return loanAmount;
	}

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
 
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}


	public void setMonthlyInterestRate(double monthlyInterestRate){
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestRate(){
		return (annualInterestRate / 12)/100;
	}

	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears = numberOfYears;
	}

	public int getNumberOfYears(){
		return numberOfYears;
	}

	public double getNumberOfMonths(){
		return numberOfYears * 12;
	}










}