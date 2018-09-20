package lab.employee.test;

public class Employee 
{
	private String firstName;
	private String lastName; 
	private double monthly; 
	
	public Employee (String first, String last, double month){
		firstName = first; 
		lastName = last; 
		monthly = month; 

		if (month < 0.0)
			monthly = 0.0;
	}
	public void setFirstName (String first){
		firstName = first;	
	}
	public String getFirstName (){
		return firstName;
	}
	public void setLastName (String last){
		lastName = last;
	} 
	public String getLastName (){
		return lastName;
	} 
	public void setMonthlySalary (double month){
		monthly = month;
	} 
	public double getMonthlySalary (){
		return monthly;
	} 
	public double getYearlySalary(){
		double yearly = monthly * 12;
		return yearly;
	} 
	public double getRaiseSalary(){
		double raise =  monthly * 0.1 ;
		double raiseSalary = ( monthly + raise ) * 12;
		return raiseSalary;
	} 	
} 
