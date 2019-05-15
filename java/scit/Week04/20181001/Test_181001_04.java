import java.util.Random;
public class Test_181001_04 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(10);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + (i < 9 ? " " : "\n"));
		}
	}
}