// 시작 값
// 누적 합계 값
// 몇 번째인지 체크

class FiftiethSumNum {
	public static void main(String[] args) {
		int output = 1;
		int check;
		for (int i = 2; i <= 50; i++) {
			check = i % 2;
			if ( check == 0 ) {
				output += i;
			} else {
				output -= i;
			}
		}
		System.out.println(output);
	}
}