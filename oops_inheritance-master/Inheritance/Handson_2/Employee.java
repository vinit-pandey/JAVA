//package Handson_2;

public class Employee extends Person {
	
	double annualSalary;
	String nationalInsuranceNumber;
	int yearOfStart;
	public Employee(String personName, double annualSalary, String nationalInsuranceNumber, int yearOfStart) {
		super(personName);
		this.annualSalary = annualSalary;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
		this.yearOfStart = yearOfStart;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	public int getYearOfStart() {
		return yearOfStart;
	}
	public void setYearOfStart(int yearOfStart) {
		this.yearOfStart = yearOfStart;
	}

	
	
	
	

}
