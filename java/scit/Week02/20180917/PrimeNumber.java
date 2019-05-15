//for를 이용한 소수를 출력하세요 (1~100까지)

public class PrimeNumber
{
	//1과 자기 자신 이외에 더이상 나눌 수 없는 수만 출력
	//1은 다 나눠지기 때문에 2부터 자기자신까지 숫자를 1부터 더하면서 나누어 떨어지는 경우가 1번만 있는 경우 
	public static void main(String[] args){
		System.out.println("1");
		for ( int i = 1; i <= 1000; i++ ){
			int count = 0;
			for ( int j = 2; j <= i; j++ ){ 
				int nameoji = i % j;
				if ( nameoji == 0 ){
					count++;
				}
			}
			if ( count == 1 ){
				System.out.println(i);
			}
		}
	}
}

// 약분 되는 소수 / 자기 자신을 제외하고 2, 3, 5, 7