// 시작 숫자 1부터 시작
// 더할 숫자 누계

class Plus {
	public static void main(String[] args) {
		int total = 1;
		for (int sum = 0; ; sum++) {
			total = total + sum;
			if(total > 100){
				System.out.println();
				break;
			}
			System.out.print(total + " ");
		}
	}
}