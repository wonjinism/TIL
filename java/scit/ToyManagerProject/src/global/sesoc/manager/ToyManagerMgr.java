package global.sesoc.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

public class ToyManagerMgr implements ToyManager {
	private final String FILE_NAME = "toy.dat";
	private List<Toy> toyList; // 각종 Toy 정보를 담을 리스트

	private FileInputStream fis; // 파일을 읽기 위한 객체
	private FileOutputStream fos; // 파일을 쓰기 위한 객체
	private ObjectInputStream ois; // 객체를 읽기 위한 객체
	private ObjectOutputStream oos; // 객체를 쓰기 위한 객체

	/**
	 * 생성자
	 * 
	 * @throws Exception
	 */
	public ToyManagerMgr() {
		// 이전에 등록된 toy 정보가 등록된 파일의 정보를 읽어들인다.

		if (new File(FILE_NAME).exists()) {
			loadFile();
		} else {
			toyList = new ArrayList<Toy>();
		}
	}

	@Override
	public void loadFile() {
		try {
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			toyList = (List<Toy>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean saveFile() {
		try {
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(toyList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean insertToy(Toy toy) {
		Toy searchToy = searchToy(toy.getSerialNum());
		if (searchToy == null) {
			toyList.add(toy);
			return true;
		} else
			return false;
	}

	@Override
	public Toy searchToy(String serialNum) {
		for (Toy toy : toyList) {
			if (toy.getSerialNum().equals(serialNum)) {
				return toy;
			}
		}
		return null;
	}

	@Override
	public boolean deleteToy(String serialNum) {
		Toy searchToy = searchToy(serialNum);
		if (searchToy != null) {
			toyList.remove(searchToy);
			return true;
		}
		return false;
	}

	@Override
	public List<Toy> toyListForPrice(int minPrice, int maxPrice) {
		List<Toy> toyListForPrice = new ArrayList<Toy>();
		for (Toy toy : toyList) {
			int toyPrice = toy.getPrice();
			if (toyPrice >= minPrice && toyPrice <= maxPrice) {
				toyListForPrice.add(toy);
			}
		}
		return toyListForPrice;
	}

	@Override
	public List<Toy> printToyInfo(int type) {
		List<Toy> printToyList = new ArrayList<Toy>();
		switch (type) {
		case 1:
			return this.toyList;
		case 2:
			for (Toy toy : this.toyList) {
				if (toy instanceof Bicycle) {
					printToyList.add(toy);
				}
			}
			break;
		case 3:
			for (Toy toy : this.toyList) {
				if (toy instanceof Drone) {
					printToyList.add(toy);
				}
			}
			break;
		case 4:
			for (Toy toy : this.toyList) {
				if (toy instanceof GameConsole) {
					printToyList.add(toy);
				}
			}
			break;
		default: // 그 외의 값은 메소드 입력 전에 필터
		}
		return printToyList;
	}
}
