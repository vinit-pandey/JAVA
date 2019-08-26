
public class Employee implements Cloneable{

	String name;
	int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + "";
	}
	public static void main(String[] args) {
		
		try {
			Employee employee1 = new Employee("Arghya-Mitra",25000);
			Employee employee2 = (Employee)employee1.clone();
			employee1.salary = 30000;
			System.out.println(employee1.toString());
			System.out.println(employee2.toString());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
