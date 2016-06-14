import java.util.Scanner;

public class WhatIf {

	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);
		int customerNum;
		double salesAmount;
		String customerName;
		String taxCode;
		double taxAmount = 0.0d;
		double totalSales=0.0d;

		// Prompt user for sales inputs and determine results
		System.out.print("Enter customer number: ");
		customerNum= keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter Customer Name: ");
		customerName = keyboard.nextLine();
		System.out.print("Enter taxcode(NRM, NPF, or BIZ): ");
		taxCode=keyboard.nextLine();
		System.out.print("Enter the sales amount: ");
		salesAmount = keyboard.nextDouble();
		keyboard.nextLine();

		//Determine tax based on tax code
		if (taxCode.toUpperCase().equals("NRM")){
			taxAmount = .06;
		}
		else if (taxCode.toUpperCase().equals("NPF")){
			taxAmount=0.0;
		}
		else if (taxCode.toUpperCase().equals("BIZ")){
			taxAmount=.045;	
		}else{
			taxAmount = 0.0;
		}
		System.err.println("Calculating tax amt here");
		System.err.println(taxAmount);
		totalSales = salesAmount+(salesAmount*taxAmount);

		//Prints Result to Terminal
		System.out.println("---------------------------------------");
		System.out.println("Customer Name: " + customerName ); 
		System.out.println("Customer Number: " + customerNum);
		System.out.println("Sales amount:" + salesAmount + " Tax percent added: " + taxAmount );
		System.out.println("Taxes owed: " + salesAmount*taxAmount );
		System.out.println("Total sales: " + totalSales);


	}
}
