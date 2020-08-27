package atmproject;

import java.text.DecimalFormat;
import java.util.*;
import java.lang; 

public class Account {
   private int customerNumber;
   private int pinNumber;
   private int currentBalance=0;
   private int savingsBalance=0;

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");

public int setCustomerNumber(int customerNumber) {
       this.customerNumber = customerNumber;
 	return customerNumber;
}
 	public int getCustomerNumber() {
		return customerNumber;
}
     public int setPinNumber( int pinNumber) {
 	this.pinNumber = pinNumber;
 	return pinNumber;
}  
	public int getPinNumber() {
		return pinNumber;
}
	public double getCurrentBalance() {
		return currentBalance;
}
	public double getSavingsBalance() {
		return savingsBalance;
}
   	public double calCurrentWithdraw(double amount) {
	   currentBalance =( currentBalance - amount);
  		return currentBalance;
}
	public double calSavingsWithdraw( double amount){
		savingsBalance =( savingsBalance -amount);
		return savingsBalance;
}
	public double calCurrentDeposit( double amount) {
	 currentBalance =( currentBalance + amount);
  		return currentBalance;           
}
	public double calSavingsWithdraw( double amount){
		savingsBalance =( savingsBalance + amount);
		return savingsBalance;
}
	public int getCurrentWithdrawInput() {
		System.out.println("checking account Balance : " + moneyFormat.format(currentBalance));
 		System.out.println("Amount you want to withdraw from Current account: ");
		double amount = input.nextDouble();

		if((currentBalance - amount)>=0) {
		calCurrentWithdraw(amount);
	System.out.println("new current account balance:" + moneyFormat.format(currentBalance));	
	}
		else{
                     System.out.println("balance cannot be negative");
}	
}
	public int getSavingsWithdrawInput() {
		System.out.println("Savings account Balance : " + moneyFormat.format(savingsBalance));
 		System.out.println("Amount you want to withdraw from Savings account: ");
		double amount = input.nextDouble();

		if((savingsBalance - amount)>=0) {
		calSavingsWithdraw(amount);
	System.out.println("new current account balance:" + moneyFormat.format(savingsBalance));	
	}
		else{
                     System.out.println("balance cannot be negative");
}	
}
	public int getSavingsDepositInput() {
		System.out.println("Savings account Balance : " + moneyFormat.format(savingsBalance));
 		System.out.println("Amount you want to withdraw from Savings account: ");
		double amount = input.nextDouble();

		if((savingsBalance + amount)>=0) {
		calSavingsDeposit(amount);
	System.out.println("new savings account balance:" + moneyFormat.format(savingsBalance));	
	}
		else{
                     System.out.println("balance cannot be negative");
}	
}
	public int getCurrentDepositInput() {
		System.out.println("Current account Balance : " + moneyFormat.format(currentBalance));
 		System.out.println("Amount you want to withdraw from current account: ");
		double amount = input.nextDouble();

		if((currentBalance + amount)>=0) {
		calCurrentDeposit(amount);
	System.out.println("new savings account balance:" + moneyFormat.format(currentBalance));	
	}
		else{
                     System.out.println("balance cannot be negative");
}	
}

}
