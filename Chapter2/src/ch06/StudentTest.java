package ch06;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentBaek = new Student();
		
		System.out.println(studentBaek.showStudentInfo());
		
		Student studentLee = new Student(123456, "lee", 3);
		System.out.println(studentLee.showStudentInfo());
	}

}
