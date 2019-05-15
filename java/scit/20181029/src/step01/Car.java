package step01;

public class Car {
	private String model;
	public Car(String model) {
		super();
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null && obj instanceof Car) {
			Car c = (Car)obj;
			flag = this.model.equals(c.getModel());
		}
		return flag;
	}
}
