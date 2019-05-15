public class Homework_180928_01 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 8, 13, 17, 20};
		int minDistance = 0;
		String result = null;
		// 반복문 i가 반복문 j의 다른 배열 자리 애들과 비교
		// 현재 minDistance 숫자보다 작은 경우에 그 숫자를 result에 기록한다.
		int distance = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++ ) {
				distance = arr[i] - arr[j];
				if (distance < 0) {
					distance *= -1;
				}
				if (minDistance == 0){ // minDistance를 일단 업데이트
					minDistance = distance;
					result = arr[i] + ", " + arr[j];
				} else if (distance < minDistance) { // 비교해서 업데이트
					minDistance = distance;
					result = arr[i] + ", " + arr[j];
				}
			}
		}
		System.out.println(result);
	}
}