package com.nexture.hairshop;

public class Visitor extends ServiceMenu {
	String name;
	int age;

	public Visitor(int cut, int perm, int color, int shampoo, int scalpmassage, String name, int age) {
		super(cut, perm, color, shampoo, scalpmassage);
		this.name = name;
		this.age = age;
	}

	@Override
	public String calculating() {
//		⑥ Service Menu 클래스로 선언한 추상 메소드를 재정의할 것.
//		　　※@Override: 연령에 따른 할인을 적용하여 계산할 로직을 작성하기.
//		　　※합계가격의 결과는 정수형이 되도록 형변환해주기.
//		　　※[시나리오] 시트 결과화면을 참고하여 String형으로 합계가격을 포함한 고객의 계산서 내용을 반환하도록 작성하기.
//		예) "xx씨의 계산서:xxxx엔"이라는 String형의 반환값을 반환하도록 작성하기.
		
		int total =	this.cut + this.perm + this.color + this.shampoo + this.scalpmassage;
		String result = null;
		
		if (age > 18) {
			result = total + "円";
		} else {
			result = (total/10) * 9 + "円(割引提供)";
		}
		
		return name + "様の計算書　：" + result;
	}
}
