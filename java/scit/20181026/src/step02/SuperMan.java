package step02;

public class SuperMan implements Fighter, Flyer {
	@Override
	public void fly() {
		System.out.println("수퍼맨이 하늘을 날다");
	}

	@Override
	public void fight() {
		System.out.println("악당과 싸우다");
	}

}
