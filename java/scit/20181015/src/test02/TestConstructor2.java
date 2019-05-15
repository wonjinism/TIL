package test02;

class CreditCard{
	private String name;
	private int age;
	private String address;
	private int phoneNumber;
	CreditCard(){};
	CreditCard(String name, int age, String address, int phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber; 
	}
	CreditCard(CreditCard card){
		this.name = card.getName();
		this.age = card.getAge();
		this.address = "Bundang"; // 특정값으로 지정 가능
//		this.phoneNumber = card.getPhoneNumber(); // 지정 안하는 경우 기본값
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}

public class TestConstructor2 {
	public static void main(String[] args) {
		CreditCard card = new CreditCard("Peter", 25, "Centum", 33334444);
		System.out.println(card.toString());
		
		CreditCard card2 = new CreditCard();
		card2.setName("Peter");
		card2.setAge(25);
		card2.setAddress("Centum");
		card2.setPhoneNumber(33334444);
		System.out.println(card2.toString());
//		card.setAddress("Bundang");
//		System.out.println(card.getAddress());
		
		CreditCard card3 = new CreditCard(card2);
		System.out.println(card3.toString());
	}
}