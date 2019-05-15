package game2;

public class Answer {

	public String Measure(int x, int a) {
		
		int count = 0;
		
		if (x > a) {
			System.out.println("크다");
			count += 1;
			return "A";
		} else if (x < a) {
			System.out.println("작다");
			count += 1;
			return "B";			

		} else {
			System.out.println("맞았다(" + count + "번)");			
			return "C";			
		}
	}
}
