package step04;

public class TestException3 {
	/*
	 * 예외 발생 예상지점은 try로 처리하고
	 * 해당 예외에 대한 처리는 catch로 한다.
	 * 이 때 부모타입인 Exception 처리하는 방안과 구체적인 예외 타입인 
	 * ArrayIndexOutOfBoundsException 로 처리하는 방안의 장, 단점은 무엇일까?
	 * 1. 부모타입으로 처리하면 많은 예외를 하나의 catch로 처리할 수 있다.
	 * 	이 경우 구체적인 예외에 대한 대처 방안을 마련하기 어려운 단점이 있다.
	 * 2. 구체적인 해당 예외 클래스로 처리하면 케이스별로 많은 예외 처리가 필요하지만
	 * 	예외에 대한 구체적인 처리 방안을 마련할 수 있다.
	 * 3. 위의 장단점이 존재하므로 하나의 try{}에 여러개의 catch를 정의하는 것으로 해결
	 * 	
	 */
	public static void main(String[] args) {
		int m[] = new int[3];
		try{
			System.out.println(m[3]); // ArrayIndexOutOfBoundsException
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("배열 범위를 초과하여 출력 불가");
		}
		System.out.println("프로그램 정상동작");
	}
}
