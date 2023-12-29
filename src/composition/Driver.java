package composition;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is  has a relation ship
		Employee employee = new Employee(1, "Bhagyashri",
				new Address(101, "Gajanan", "Osmanabad", "Maharashtra", "India"));
		
		System.out.println("Employee Name is : "+employee.getEmployeeName());
		System.out.println("Employee Country is : "+employee.getAddress().getCountry());
	}

}
