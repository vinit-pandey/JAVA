//package Handson_2;
import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Ravi", 25000.50,"Ravi@2019",2019);
		
		System.out.println("Name: "+employee.getPersonName()+" Salary :"+employee.getAnnualSalary()+
				" NationalInsuranceNumber: "+employee.getNationalInsuranceNumber()+
				" year of Start: "+employee.getYearOfStart());
		
		//To implement setter method...
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Update Salary");
		
		double updatedSal = sc.nextDouble();
		
		employee.setAnnualSalary(updatedSal);
		System.out.println("New Details.......");
		
		System.out.println("Name: "+employee.getPersonName()+" Salary :"+employee.getAnnualSalary()+
				" NationalInsuranceNumber: "+employee.getNationalInsuranceNumber()+
				" year of Start: "+employee.getYearOfStart());
		
		sc.close();
	}

}
