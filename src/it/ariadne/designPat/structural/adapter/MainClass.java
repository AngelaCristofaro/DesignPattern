package it.ariadne.designPat.structural.adapter;

public class MainClass {

	public static void main(String[] args) {
		Contact c = new Customer("Riccardo Golia");
        c = new EmployeeAdapter(new Employee("Riccardo", "Golia"));
        System.out.println(c.FullName());
	}
   
}
