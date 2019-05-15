package sesoc.global.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import sesoc.global.vo.DeliveryOrder;
import sesoc.global.vo.Food;
import sesoc.global.vo.Order;
import sesoc.global.vo.StoreOrder;

public class SaleManager implements Manager {
	private List<Order> orderList = new ArrayList<>();
	private List<Food> foodList = new ArrayList<>();

	private final String FILE_NAME = "menu.txt"; // 프로젝트 바로 이하에 파일을 생성했기 때문에 파일명으로 접근이 가능
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader br;
	private BufferedWriter bw;

	// 파일 입력
	private FileInputStream fis;
	private ObjectInputStream ois;
	// 파일 출력
	private FileOutputStream fos;
	private ObjectOutputStream oos;

	// 레포트 파일 기록
	private PrintWriter pw;

	public SaleManager() {
		getFile();
	}

	@Override
	public void getFile() {
		try {
			fr = new FileReader(FILE_NAME); // FileNotFoundException
			br = new BufferedReader(fr);
			String str = null;
			while ((str = br.readLine()) != null) { // IOException
				String[] sa = str.split(",");
				int foodNo = Integer.parseInt(sa[0]);
				String foodName = sa[1];
				int price = Integer.parseInt(sa[2]);
				Food f = new Food(foodNo, foodName, price);
				foodList.add(f);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Food> getFood() {
		return this.foodList;
	}

	@Override
	public Order findOrder(int select) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deleteOrder(int select) {
		if (orderList.get(select) != null) {
			orderList.remove(select);
			System.out.println(" ** 주문 취소가 완료되었습니다.");
			System.out.println();
		} else {
			System.out.println(" ** 잘못된 주문번호입니다.");
			System.out.println();
		}
		return null;
	}

	@Override
	public void showAll() {
		for (int i = 0; i < orderList.size(); i++) {
			System.out.print(orderList.get(i).showOrderSituation());
		}
		int[] salesTotal = calcSalesTotal(); 
		System.out.println("[ 매장 판매 총액 ] " + salesTotal[0] + "원");
		System.out.println("[ 배달 판매 총액 ] " + salesTotal[1] + "원");
		System.out.println();
	}

	@Override
	public boolean insertOrder(Order order) {
		boolean result = false;
		if (orderList.add(order)); {
			System.out.print(order.showOrderSituation());
			Map m = order.getOrderedFoods();
			Collection col = m.keySet();
			Iterator it = col.iterator();
			ArrayList<Food> al = new ArrayList();
			while(it.hasNext()) {
				al.add((Food) it.next());
			}
			int total = 0;
			for (int i = 0; i < al.size(); i++) {
				Food f = al.get(i);
				int fp = f.getPrice();
				total += fp * (Integer)m.get(f); 
			}
			System.out.println("총 합계 : " + total + "원");
			System.out.println(" ** 음식 주문을 완료하였습니다.");
			System.out.println();
			result = true;
		} 		
		return result;
	}

	@Override
	public void saveFile() {
		// 오늘 날짜 생성
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		String today = year + "년 " + month + "월 " + date + "일";

		String fileName = "Report_" + month + "월" + date + "일.dat";

//		if (f.exists() != true) {
//			f.getParentFile().mkdirs();
//			f.createNewFile();
//		}
//		try {
//			fos = new FileOutputStream(path);
//			oos = new ObjectOutputStream(fos);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		try {
			// 파일 생성 및 기록 준비
			fw = new FileWriter(fileName); // IOException
			pw = new PrintWriter(fw);
			// 보고서 양식
			pw.println("[ SCIT Restaurant 매출 보고서");
			pw.println(today);
			pw.println("");
			
			// 주문 내역
			for (Order order : orderList) {
				pw.println(order.showOrderSituation());
			}
			pw.println();
			// 주문 내역
//			for (int i = 0; i < orderList.size(); i++) {
//				pw.print(orderList.get(i).showOrderSituation());
//			}	
			// 판매 총액
			int[] salesTotal = calcSalesTotal();
			pw.println("[ 매장 판매 총액 ] " + salesTotal[0] + "원");
			pw.println("[ 배달 판매 총액 ] " + salesTotal[1] + "원");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				fw.close(); // IOException
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("당일 매출 파일이 생성되었습니다.");
		System.out.println();
	}

	@Override
	public int[] calcSalesTotal() {
		int[] salesTotal = {0,0};
		for (int j = 0; j < orderList.size(); j++) {
			Order to = orderList.get(j);
			if (to instanceof StoreOrder) {
				Map tm = to.getOrderedFoods();
				Collection tcol = tm.keySet();
				Iterator tit = tcol.iterator();
				ArrayList<Food> tl = new ArrayList();
				while(tit.hasNext()) {
					tl.add((Food) tit.next());
				}
				for (int i = 0; i < tl.size(); i++) {
					int tp = tl.get(i).getPrice(); 
					salesTotal[0] += (tp * (Integer)tm.get(tl.get(i))); 
				}
			} else if(to instanceof DeliveryOrder) {
				Map tm = to.getOrderedFoods();
				Collection tcol = tm.keySet();
				Iterator tit = tcol.iterator();
				ArrayList<Food> tl = new ArrayList();
				while(tit.hasNext()) {
					tl.add((Food) tit.next());
				}
				for (int i = 0; i < tl.size(); i++) {
					int tp = tl.get(i).getPrice(); 
					salesTotal[1] += (tp * (Integer)tm.get(tl.get(i))); 
				}
			}
		}
		return salesTotal;
	}
}
