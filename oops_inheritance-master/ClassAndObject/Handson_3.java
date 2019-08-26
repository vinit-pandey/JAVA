import java.util.*;
class Patient{
	//patientName(String),height(double),width(double)
	String patientName;
	double height,width;

	public Patient(String patientName, double height, double width) {
		this.patientName = patientName;
		this.height = height;
		this.width = width;
	}
	
	public double computeBMI(double weight) {
		return (weight/(height*height)); 
	}
}

public class Handson_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String str = sc.next();
		System.out.println("Enter Height: ");
		double hi = sc.nextDouble();
		System.out.println("Enter Width: ");
		double wi = sc.nextDouble();
		System.out.println("Enter weight: ");
		double weight = sc.nextDouble();
		Patient patient = new Patient(str, hi, wi);
		
		System.out.println(patient.patientName+"'s "+"BMI is : "+patient.computeBMI(weight));

	}

}