package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		List<TaxPayer> taxpayers = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Enter the number tax payer: ");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Tax payer #" + i + " data");

			System.out.print("Individual or Company (i/c)? ");
			char type = teclado.next().charAt(0);

			System.out.println("Name:");
			teclado.nextLine();
			String name = teclado.nextLine();

			System.out.print("Annual Income: ");
			double annual_income = teclado.nextDouble();

			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = teclado.nextDouble();

				taxpayers.add(new Individual(name, annual_income, healthExpenditures));
			}

			if (type == 'c') {
				System.out.println("Number of Employees: ");
				int numberOfEmployees = teclado.nextInt();

				taxpayers.add(new Company(name, annual_income, numberOfEmployees));
			}
		}

		System.out.println();

		System.out.println("*** TAXES PAID ***");

		for (TaxPayer t : taxpayers) {
			System.out.println(t.getName() + ": R$" + String.format("%.2f", t.tax()));

		}

		System.out.println();

		System.out.println(">> TOTAL TAXES <<");
		
		double sum = 0.0;
		
		for (TaxPayer t : taxpayers) {
			sum = sum + t.tax();
		}
		System.out.println(String.format("%.2f", sum));

		teclado.close();
	}

}
