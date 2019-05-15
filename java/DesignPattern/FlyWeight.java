/*
 * FlyWeight 패턴의 목적
 * 이미 생성된 오브젝트를 가능한한 재이용해서
 * 필요없는 오브젝트의 생성(메모리의 사용)을 방지
 * 대표적인 객체, String
 */

public class FlyWeight {
	private int id;

	public FlyWeight(int id) {
		super();
		this.id = id;
	}
}