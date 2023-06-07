package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee ethiopiaCoffee = new EtiopiaAmericano();
		ethiopiaCoffee.brewing();
		System.out.println();
		
		Coffee etiopiaLatte = new Latte(ethiopiaCoffee);
		etiopiaLatte.brewing();
		System.out.println();
		
		Coffee etiopiaMocha = new Mocha(new Latte(ethiopiaCoffee));
		etiopiaMocha.brewing();
		
	}

}

