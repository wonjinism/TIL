package interfaceex03;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort asceding");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort desceding");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}
	
	
}
