public class Test_181002_02 {
	public static void main(String[] args) {
		System.out.println("배열을 다른 배열로 복사");
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] b = null;

		b = new int[a.length];

		System.out.print("a[]: {");
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(a[i] + (i < a.length - 1 ? ", " : "}\n"));
		}
		System.out.print("b[]: {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + (i < b.length - 1 ? ", " : "}\n"));
		}
	}
}