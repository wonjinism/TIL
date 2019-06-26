package com.nexture.hairshop;

public abstract class ServiceMenu {
	int cut;
	int perm;
	int color;
	int shampoo;
	int scalpmassage;
	
	public ServiceMenu(int cut, int perm, int color, int shampoo, int scalpmassage) {
		this.cut = cut;
		this.perm = perm;
		this.color = color;
		this.shampoo = shampoo;
		this.scalpmassage = scalpmassage;
	}

	public abstract String calculating();
}
