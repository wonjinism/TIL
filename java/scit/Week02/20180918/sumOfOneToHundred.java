class sumOfOneToHundred 
{
	int sum; // 클래스 내에 선언한 int // 전역변수 선언

	public sumOfOneToHundred(){ // 생성자		
	}

/*	public int getSum() {
		return sum;
	}
*/
	public static void main(String[] args) 
	{
		sumOfOneToHundred test = new sumOfOneToHundred(); // test라는 이름으로 객체 생성
//		int sum = test.getSum(); // 지역변수 선언
		System.out.println(test.sum); 


		for (int i = 1; i <= 100; i++){
			if ( i % 2 != 0){
				test.sum = test.sum + i;
			}	
		}
		System.out.println(test.sum);
	}
}