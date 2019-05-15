package step01;

public class Person {
	private String name;
	private Car carID;
	public Person() {}
	public Person(String name, Car carID) {
		this.name = name;
		this.carID = carID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the car
	 */
	public Car getCarID() {
		return carID;
	}
	/**
	 * @param car the car to set
	 */
	public void setCarID(Car carID) {
		this.carID = carID;
	}
}
