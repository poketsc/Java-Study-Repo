package ch09;

// 필요한 기능들을 다 구현했는데 class 앞에 abstract 으로 선언이 되면 new 로 생성 불가능
// 이러한 경우는 이 클래스는 상속만을 위한 클래스가 된다.

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");	
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
}
