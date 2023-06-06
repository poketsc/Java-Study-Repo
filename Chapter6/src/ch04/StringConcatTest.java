package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		
//		람다식을 사용하면 내부적으로 이렇게 작동됨.
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1 + "," + s2);
				
			}
			
		};

	}

}
