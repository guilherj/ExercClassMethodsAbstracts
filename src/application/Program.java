package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		TaxPayer tp1 = new Individual("Guilherme", 50000.00, 2000.00);
		TaxPayer tp2 = new Company("Screen Fun", 400000.00, 25);
		
		System.out.println(tp1.tax());
		System.out.println(tp2.tax());

	}

}
