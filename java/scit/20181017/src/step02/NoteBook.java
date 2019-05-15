package step02;

public class NoteBook {
	private String maker;
	private String model;
	public NoteBook(String maker, String model) {
		this.maker = maker;
		this.model = model;
	}
	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}
	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
