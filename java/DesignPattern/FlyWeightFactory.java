import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<Integer, FlyWeight> pool;

	public FlyWeightFactory() {
		super();
		this.pool = new HashMap<>();
	}
	
	public void generateFlyWeight(int id) {
//		FlyWeight flyWeight = new FlyWeight(id);
//		pool.put(id, flyWeight);

		// flyWeight
		FlyWeight flyWeight = pool.get(id);
		if(flyWeight == null) {
			flyWeight = new FlyWeight(id);
			pool.put(id, flyWeight);
		}
	}
	
	public void printFlyWeight() {
		for (int i : pool.keySet()) {
			System.out.print(i + " : ");
			System.out.println(System.identityHashCode(pool.get(i))); // 인자값으로 전달된 객체의 주소값을 출력
		}
	}
	
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		factory.generateFlyWeight(0);
		factory.generateFlyWeight(1);
		factory.generateFlyWeight(2);
		factory.printFlyWeight();
		factory.generateFlyWeight(0);
		factory.generateFlyWeight(1);
		factory.generateFlyWeight(2);
		factory.printFlyWeight();
	}
}
