package game;

public class Answer {

	int count = 0;
	
	public String Measure(int x, int a) {
	
		if (x < a) {
			System.out.println("크다");
			count += 1;
			return "A";
		} else if (x > a) {
			System.out.println("작다");
			count += 1;
			return "B";			
		} else {
			count += 1;
			System.out.println("맞았다(" + count + "번)");	
			return "C";			
		}
	}
}
