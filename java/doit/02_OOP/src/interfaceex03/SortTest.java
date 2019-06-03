package interfaceex03;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch ==  'B' || ch == 'b') {
			sort = new BubbleSort();
		}else if(ch == 'h' || ch == 'H') {
			sort = new HeapSort();
		}else if(ch == 'q' || ch == 'Q') {
			sort = new QuickSort();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		// 정렬 방식과 상관 없이 선언되는 매출
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
