package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeBaek = new Employee();
		employeeBaek.setEmployeeName("이순신");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeBaek.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId());

	}

}
