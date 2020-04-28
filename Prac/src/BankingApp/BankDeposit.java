package BankingApp;

import java.util.Scanner;

public class BankDeposit {

	String customerName;
	int acountNumber;
	int balance;
	int previousTransaction;
	
	BankDeposit(String customerName, int acountNumber){
		this.customerName = customerName;
		this.acountNumber = acountNumber;
	}
	
	public void deposite(int amount) {
		if(amount!=0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	public void withraw(int amount) {
		if(amount!=0) {
		balance = balance - amount;
		previousTransaction = -amount;
		}
	}
	public void getPreTrans() {
		if(previousTransaction>0) {
			System.out.println("Deposited: " +previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("Withrawn: " +Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	
	
	public void menue() {
		
		
		System.out.println("Welcome Mr/Mrs "+customerName+ " with Account Number: "+acountNumber);
		System.out.println("\n");
		System.out.println("Please Choose Option:");
		System.out.println("A: Balance: ");
		System.out.println("B: Deposit: ");
		System.out.println("C: Withraw: ");
		System.out.println("D: Previous Transaction: ");
		System.out.println("E: Exit");
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.println("******************************");
			
			option = scanner.next().charAt(0);
		
		switch(option) {
		case 'A': 
			System.out.println("---------------------------");
			System.out.println("Your balance is: "+balance);
			System.out.println("Please Choose Option:");
			System.out.println("A: Balance: ");
			System.out.println("B: Deposit: ");
			System.out.println("C: Withraw: ");
			System.out.println("D: Previous Transaction: ");
			System.out.println("E: Exit");
			System.out.println("---------------------------");
			
			
			break;
			
		case 'B':
			System.out.println("---------------------------");
			System.out.println("Enter your deposited: ");
			int amount1 = scanner.nextInt();
			deposite(amount1);
			System.out.println("Please Choose Option:");
			System.out.println("A: Balance: ");
			System.out.println("B: Deposit: ");
			System.out.println("C: Withraw: ");
			System.out.println("D: Previous Transaction: ");
			System.out.println("E: Exit");
			System.out.println("---------------------------");
			break;
			
		case 'C': 
			System.out.println("---------------------------");
			System.out.println("How Much you want to withrow: ");
			int amount2 = scanner.nextInt();
			withraw(amount2);
			System.out.println("Please Choose Option:");
			System.out.println("A: Balance: ");
			System.out.println("B: Deposit: ");
			System.out.println("C: Withraw: ");
			System.out.println("D: Previous Transaction: ");
			System.out.println("E: Exit");
			System.out.println("---------------------------");
			break;
			
		case 'D': 
			System.out.println("---------------------------");
			System.out.println("Your Previouse transaction is: ");
			getPreTrans();
			System.out.println("Please Choose Option:");
			System.out.println("A: Balance: ");
			System.out.println("B: Deposit: ");
			System.out.println("C: Withraw: ");
			System.out.println("D: Previous Transaction: ");
			System.out.println("E: Exit");
			System.out.println("---------------------------");
			break;
			
		case 'E': 
			System.out.println("---------------------------");
			break;
		
			default:
				System.out.println("Sorry Invalid Option");
		}
		} while(option != 'E');
		
	}
	
		
	public static void main(String[] args) {
		
		BankDeposit obj = new BankDeposit("Ehsan",123456);
		obj.menue();
	}

}
