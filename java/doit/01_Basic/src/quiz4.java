
public class quiz4 {
	public static void main(String[] args) {
		int space = 4;
		int starCount = 1;
		int maxLine = 4;
		
		for (int i = 1; i <= maxLine; i++) {
			for (int j = 1; j <= space - i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < starCount; k++) {
				System.out.print("*");
			}
			starCount += 2;
			System.out.println();
		}
	}
}
