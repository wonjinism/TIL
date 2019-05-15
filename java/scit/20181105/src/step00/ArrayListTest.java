package step00;

import java.util.ArrayList;

public class ArrayListTest {
	private static ArrayList<RealEstate> list = new ArrayList<>();
	
	public static void main(String[] args) {
		list.add(new BuyingAndSelling("옥탑", 16, "6471", 3500));
		list.add(new Charter("옥탑", 16, "6472", 2500));
		list.add(new MonthlyRent("옥탑", 16, "6473", 1500));
		System.out.println(list.get(0) instanceof BuyingAndSelling);
		System.out.println(list.get(0));
		
		RealEstate rs = (RealEstate)list.get(0);
		System.out.println(rs.getInfo());
		
	}
}
