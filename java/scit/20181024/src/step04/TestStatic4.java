package step04;

class A {
	static int i;
	A(){
		i++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println(a.i); // 1		
		a = new A();
		System.out.println(a);
		System.out.println(a.i); // 2 public 이었다면 초기화되어서 1이었을 것 
		a = new A();
		System.out.println(a);
		System.out.println(a.i); // 3 
	}
}
