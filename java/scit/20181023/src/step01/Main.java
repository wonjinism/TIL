package step01;

public class Main {
	public static void main(String[] args) {
//		Person person = new Person(); // 추상클래스는 이런 형태로는 생성 불가
		Teacher teacher = new Teacher("이강사", "서울시", "국어"); // 추상클래스를 상속 받았지만 미완성된 메소드를 완성했기 때문에 생성 가능
		teacher.printInfo();
		
		Person person1 = new Teacher("김강사", "서울시", "영어");
		person1.printInfo();
		
		Person person2 = new Student("김학생", "서울시", "1234");
		person2.printInfo();
	}
}