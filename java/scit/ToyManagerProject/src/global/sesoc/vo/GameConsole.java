package global.sesoc.vo;

public class GameConsole extends Toy {
	// Code Here
	// 필요한 필드, 생성자, setter/getter, toString() overriding
	private boolean isPortable;

	public GameConsole(String serialNum, String name, int price, boolean isPortable) {
		super(serialNum, name, price);
		this.isPortable = isPortable;
	}

	public boolean isPortable() {
		return isPortable;
	}

	public void setPortable(boolean isPortable) {
		this.isPortable = isPortable;
	}

	@Override
	public String toString() {
		String isPortable = null;
		if (this.isPortable == true) {isPortable = "Y";}
		else {isPortable = "N";}
		return "[게임콘솔]	 " + super.toString() + ", 휴대용=" + isPortable +"]"; 
	}
}
