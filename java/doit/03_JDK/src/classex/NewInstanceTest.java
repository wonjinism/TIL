package classex;

public class NewInstanceTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
	}
}
