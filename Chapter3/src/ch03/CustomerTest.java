package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
//	    업캐스팅 예)
		Customer vc = new VIPCustomer(12345, "noname");
//		Customer 에 관련된 값만 사용 가능.
	}

}
