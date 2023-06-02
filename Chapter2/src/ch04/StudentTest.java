package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentBaek = new Student();
		
		studentBaek.studentID = 12345;
		studentBaek.setStudentName("Baek");
		studentBaek.address = "서울 강남";
		
		studentBaek.showStudentInfo();
		
		System.out.println(studentBaek);
	}
}
