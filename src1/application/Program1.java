package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter number person: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Person #" + i + " data:");
			System.out.print("What is person individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			Double annualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("HealtExpenses: ");
				Double healthExpenses = sc.nextDouble();
				
				list.add(new PhysicalPerson(name, annualIncome, healthExpenses));
			}
			else {
				System.out.print("What number employee? ");
				int employeeNumber = sc.nextInt();
				
				list.add(new LegalPerson(name, annualIncome, employeeNumber));
			}

		}
		
		System.out.println();
		System.out.println("Nomes e valores");
		Double total = 0.0;
		for(Person data : list) {
			System.out.println(data.getName() + " Annual Tax: " + String.format("%.2f", data.taxCalculation()) );
			
			total += data.taxCalculation();
		}
		System.out.println("Valor Total: " + String.format("%.2f", total));
		
		sc.close();
	}
}
