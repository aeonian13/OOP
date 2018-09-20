package lab.employee.test;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee( "Bob", "Jones", 2875.00 );
		Employee e2 = new Employee( "Susan", "Baker", 3150.75 );
		
		System.out.printf( "%s %s, Yearly Salary: $%.2f\n", e1.getFirstName(), e1.getLastName(), e1.getYearlySalary() );
		System.out.printf( "%s %s, Yearly Salary: $%.2f\n", e2.getFirstName(), e2.getLastName(), e2.getYearlySalary() );
		
		System.out.println();
		
		System.out.println( "Increasing Employee Salaries by 10%" );
		System.out.printf( "%s %s, Yearly Salary: $%.2f\n", e1.getFirstName(), e1.getLastName(), e1.getRaiseSalary() );
		System.out.printf( "%s %s, Yearly Salary: $%.2f\n", e2.getFirstName(), e2.getLastName(), e2.getRaiseSalary() );
	} 
} 



