class peakFinder {
	public static void main(String[] args) {
		int peak = 4000;
		int plus = 0;
		int sum = 0;
		while ( sum < peak ) {
			plus++;
			sum += plus;
		}
		System.out.println("1 ~ " + plus + "까지의 합계 : " + sum);
	}
}