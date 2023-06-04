package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
//	    업캐스팅 예)
		Customer vc = new VIPCustomer(12345, "noname");
//		Customer 에 관련된 값만 사용 가능.
//		하지만 calPrice를 호출하면 인스턴스의 함수가 호출됨(VIPCustomer) -> 가상메서드의 원리.
		
		vc.calcPrice(1000);
		System.out.println(vc.calcPrice(1000));
	}

}
