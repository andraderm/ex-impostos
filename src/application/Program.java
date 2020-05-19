package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if(ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double income = sc.nextDouble();
				sc.nextLine();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				list.add(new Individual(name, income, healthExpenditures));
			}
			if(ch == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double income = sc.nextDouble();
				sc.nextLine();
				System.out.print("Number of employees: ");
				Integer employeeNumber = sc.nextInt();
				sc.nextLine();
				list.add(new Company(name, income, employeeNumber));
			}
		}
		
		Double total = 0.00;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : list) {
			System.out.println(tp);
			total += tp.Tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
		
		sc.close();
	}

}
