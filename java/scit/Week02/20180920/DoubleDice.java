// 주사위 두 개를 던져서 합이 6이 나오는 경우를 출력
class DoubleDice {
	public static void main(String[] args) {
		int dice1;
		int dice2;
		for ( dice1 = 1; dice1 <= 6; dice1++ ) {
			for ( dice2 = 1; dice2 <= 6; dice2++) {
				if ( dice1 + dice2 == 6 ) {
					System.out.println(dice1 + " " + dice2);
				}
			}
		}
	}
}
