package ch06;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentID;
	
//	public VIPCustomer() {
////	    부모의 생성자가 Customer()와 같이 인자값이 없으면
////		자동으로 부른다. (super())를...
////		super();
//		
////		하지만 Customer(x,y) 처럼 생성자에 인자값이 있으면 명시적으로 호출해야된다.
//		
////		VIPCustomer(x,y) 처럼...
//		
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public String getAgentID() {
		return agentID;
	}

}
