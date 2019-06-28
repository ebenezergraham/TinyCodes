package me.ebenezergraham.tinycode.java.daysofcode;


public class MonthlyInterest {
	public static  void main(String[] args){
		double loanAmount = 6000.00;
		double monthlyRate = (6.0/100.0)/12.0;
		double monthlyPayment = 0.0;
		int paymentPeriod = 5*12;
		
		double numerator = (monthlyRate * loanAmount);
		double denominator = 1 - Math.pow((1+monthlyRate),-paymentPeriod);
		 monthlyPayment = numerator / denominator;
		int result = (int)(Math.ceil(monthlyPayment*paymentPeriod)- loanAmount);
		char currency = '$';
		System.out.format("%s%.2f~%s%d",currency,Math.ceil(monthlyPayment),currency,result);
		
		
	}
}
