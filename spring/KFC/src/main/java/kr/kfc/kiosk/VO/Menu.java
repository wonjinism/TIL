package kr.kfc.kiosk.VO;

public class Menu {
	private int menu_seq;
	private int menu_type;
	private String menu_name;
	private String menu_description;
	private int original_price;
	private int promotion_price;
	private int promotion_type;
	private String release_date;
	private String image;

	public Menu() {
	}

	public Menu(int menu_seq, int menu_type, String menu_name, String menu_description, int original_price,
			int promotion_price, int promotion_type, String release_date, String image) {
		this.menu_seq = menu_seq;
		this.menu_type = menu_type;
		this.menu_name = menu_name;
		this.menu_description = menu_description;
		this.original_price = original_price;
		this.promotion_price = promotion_price;
		this.promotion_type = promotion_type;
		this.release_date = release_date;
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public int getMenu_seq() {
		return menu_seq;
	}

	public void setMenu_seq(int menu_seq) {
		this.menu_seq = menu_seq;
	}

	public int getMenu_type() {
		return menu_type;
	}

	public void setMenu_type(int menu_type) {
		this.menu_type = menu_type;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_description() {
		return menu_description;
	}

	public void setMenu_description(String menu_description) {
		this.menu_description = menu_description;
	}

	public int getOriginal_price() {
		return original_price;
	}

	public void setOriginal_price(int original_price) {
		this.original_price = original_price;
	}

	public int getPromotion_price() {
		return promotion_price;
	}

	public void setPromotion_price(int promotion_price) {
		this.promotion_price = promotion_price;
	}

	public int getPromotion_type() {
		return promotion_type;
	}

	public void setPromotion_type(int promotion_type) {
		this.promotion_type = promotion_type;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	@Override
	public String toString() {
		return "Product [menu_seq=" + menu_seq + ", menu_type=" + menu_type + ", menu_name=" + menu_name
				+ ", menu_description=" + menu_description + ", original_price=" + original_price + ", promotion_price="
				+ promotion_price + ", promotion_type=" + promotion_type + ", release_date=" + release_date + "]";
	}

}
