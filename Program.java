package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Enter employee's name: ");
		employee.name = sc.nextLine();

		System.out.print("Enter employee's gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Enter employee's tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();		
		System.out.println(employee + ", $ " + employee.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase in salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee + ", $ " + employee.netSalary());
		
		sc.close();
	}
}
