package com.nexture.hairshop;

public class HairshopMain {
	public static void main(String[] args) {
		ServiceMenu one = new Visitor(0, PriceTable.PERM, 0, PriceTable.SHAMPOO, PriceTable.SCALPMASSAGE, "오오모리", 25);
		ServiceMenu two = new Visitor(PriceTable.CUT, 0, PriceTable.COLOR, PriceTable.SHAMPOO, 0, "나카자와", 17);
		
		System.out.println(one.calculating());
		System.out.println(two.calculating());
	}
}
