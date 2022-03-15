//
//15 . Create a class called Employee that includes three pieces of information as instance variables—a 
//first name (typeString), a last name (typeString) and a monthly salary (double). Your class should 
//have a constructor that initializes the three instance variables. Provide a set and a get method 
//for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test 
//application named EmployeeTest that demonstrates class Employee’s capabilities. Create two 
//Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise 
//and display each Employee’s yearly salary again.

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee() {
		firstName = null;
		lastName = null;
		monthlySalary = 0.0;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public double getSalary() {
		return monthlySalary;
	}

	public void setfirstName(String first) {
		firstName = first;
	}

	public void setlastName(String last) {
		lastName = last;
	}

	public void setSalary(double salary) {
		monthlySalary = salary;
	}

}
