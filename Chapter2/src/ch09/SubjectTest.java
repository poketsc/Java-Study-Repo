package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentBaek = new Student(100, "Baek");
		studentBaek.setKoreaSubject("국어", 100);
		studentBaek.setMathSubject("수학", 99);
		
		studentBaek.showScoreInfo();

	}

}
